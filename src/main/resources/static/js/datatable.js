$(document).ready( function () {
    var table = $('#trialsTable').DataTable({
        "sAjaxSource": "/trials",
        "sAjaxDataProp": "",
        "order": [[ 0, "asc" ]],
        "aoColumns": [
            { "mData": "nctId"},
            { "mData": "officialTitle" },
            { "mData": "phase" },
            { "mData": "primaryCompletionDate" }
        ]
    })
});