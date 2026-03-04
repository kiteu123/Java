$(function () {

    $('.tab-btn').click(function () {

        $('.tab-btn').removeClass('active');
        $('.content').removeClass('active');

        $(this).addClass('active');

        const target = $(this).data('tab');
        $('#' + target).addClass('active');

    });

});