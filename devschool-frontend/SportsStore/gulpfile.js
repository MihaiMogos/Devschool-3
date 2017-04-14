var gulp = require('gulp');
var wiredep = require('wiredep').stream;
$ = require('gulp-load-plugins')();


gulp.task('injectApp', function () {
    var injectCss = gulp.src('src/*.css'),
        injectJs = gulp.src('src/app/**/*.js')
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

gulp.task('serve', ['injectApp', 'injectAdmin'], function () {
    gulp.src('src')
        .pipe($.serverLivereload({
            livereload: true,
            defaultFile: 'app.html',
            open: true
        }));
});

gulp.task('other', function () {
    var fileFilter = $.filter(function (file) {
        return file.stat.isFile();
    });

    return gulp.src(['src/**/*', '!src/vendor/**/*', '!src/**/*.{html,css,js}'])
        .pipe(fileFilter)
        .pipe(gulp.dest('build'));
});

gulp.task('buildApp', ['injectApp'], function () {
    return gulp.src('src/app.html')
        .pipe($.useref())
        .pipe($.if('*.js', $.ngAnnotate()))
        .pipe($.if('*.js', $.uglify()))
        .pipe($.if('*.css', $.cleanCss()))
        .pipe(gulp.dest('build'));
});

gulp.task('buildAdmin', ['injectAdmin'], function () {
    return gulp.src('src/admin.html')
        .pipe($.useref())
        .pipe($.if('*.js', $.ngAnnotate()))
        .pipe($.if('*.js', $.uglify()))
        .pipe($.if('*.css', $.cleanCss()))
        .pipe(gulp.dest('build'));
});





