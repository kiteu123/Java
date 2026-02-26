$(function () {

    $('.nav button').on('click', function () {

        var index = $(this).data('index');

        $('.container').css({
            transform: 'translateX(-' + (index * 100) + 'vw)'
        });

    });

});