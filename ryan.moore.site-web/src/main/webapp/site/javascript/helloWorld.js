$(function() {
    helloWorld.initStyling();
});


var helloWorld = {

    initStyling: function() {

        $(function () {
            $("#datepicker").datepicker();
        });

        $(function() {
            $("#accordion").accordion();
        });
    }
};