$(function () {
    var slider = $('.bxslider').bxSlider({
        auto: true,
    });

    $('.slider-basic').slick({
        autoplay: true,
        dots: true,
        arrows: false,
        infinite: true,
        speed: 500,
        slidesToShow: 1,
        slidesToScroll: 1
    });

    const $ham = $('.hamburger');
    const $nav = $('.mobile_nav');
    const $bg = $('.mobile_bg');
    const $body = $('body');



    $ham.click(function () {

        $(this).toggleClass('active');
        $nav.toggleClass('active');
        $bg.toggleClass('active');


        $body.toggleClass('hidden');

    });



    $bg.click(function () {

        closeMenu();

    });



    function closeMenu() {

        $ham.removeClass('active');
        $nav.removeClass('active');
        $bg.removeClass('active');
        $body.removeClass('hidden');

    }

    $('.mobile_gnb > li > a').click(function (e) {

        e.preventDefault();

        $(this).next('ul').slideToggle();
        $(this).parent().siblings().find('ul').slideUp();

    });

    $(document).on('keydown', function (e) {

        if (e.key === 'Escape') {
            closeMenu();
        }

    });
});