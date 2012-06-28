$(function() {
    splash.initStyling();
    splash.initEvents();
});


var splash = {

    initStyling: function() {
        $(function() {
            $("#continueButton").button();
        });
    },

    initEvents: function() {
        $('#bodyDiv').delegate(".continueButton", "click", function() {
            splash.continue();
        });
    },

    continue: function() {
        common.postToForm("m/helloWorld", {'name': "DOLPHIN"}, false);
    }
};