"use strict";

var gulp = require('gulp'),
    wiredep = require('wiredep').stream,
    $ = require('gulp-load-plugins')();

gulp.task('analyze', function () {
    gulp.src(['src/**/*.js', 'gulpfile.js', '!src/vendor/**/*.js'])
        .pipe($.jshint())
        .pipe($.jshint.reporter('default'))
        .pipe($.jshint.reporter('fail'))
        .pipe($.jscs())
        .pipe($.jscs.reporter())
        .pipe($.jscs.reporter('fail'));
});

gulp.task('inject', function () {
    var injectCss = gulp.src('src/*.css'),
        injectJs = gulp.src('src/app/**/*.js')
            .pipe($.angularFilesort());

    return gulp.src('src/index.html')
        .pipe(wiredep())
        .pipe($.inject(injectJs, {relative: true}))
        .pipe($.inject(injectCss, {relative: true}))
        .pipe(gulp.dest('src'));
});

gulp.task('serve', ['inject'], function () {
    gulp.src('src')
        .pipe($.serverLivereload({
            livereload: true,
            open: true
        }));
});
