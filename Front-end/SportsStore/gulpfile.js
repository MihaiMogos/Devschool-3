var gulp = require('gulp');
var wiredep = require('wiredep').stream;
$ = require('gulp-load-plugins')();


gulp.task('injectClient', function () {
    var injectCss = gulp.src('src/*.css'),
        injectJs = gulp.src('src/client/**/*.js')
            .pipe($.angularFilesort());

    return gulp.src('src/app.html')
        .pipe(wiredep({exclude: [/jQuery/, /\/bootstrap-css\/.*\.js$/]}))
        .pipe($.inject(injectJs, {relative: true}))
        .pipe($.inject(injectCss, {relative: true}))
        .pipe(gulp.dest('src'));
});

gulp.task('injectAdmin', function () {
    var injectCss = gulp.src('src/*.css'),
        injectJs = gulp.src('src/admin/**/*.js')
            .pipe($.angularFilesort());

    return gulp.src('src/admin.html')
        .pipe(wiredep({exclude: [/jQuery/, /\/bootstrap-css\/.*\.js$/]}))
        .pipe($.inject(injectJs, {relative: true}))
        .pipe($.inject(injectCss, {relative: true}))
        .pipe(gulp.dest('src'));
});

gulp.task('serve', ['injectClient', 'injectAdmin'], function () {
    gulp.src('src')
        .pipe($.serverLivereload({
            livereload: true,
            open: true
        }));
});