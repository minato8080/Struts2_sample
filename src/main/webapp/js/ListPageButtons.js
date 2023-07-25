/**
 * ListPageのbutton_A　全選択処理
 * ListPageのbutton_U　更新処理
 */
var counter = 0;
$(function() {
	$('input[name=button_A]').click(function() {
		$('input[class=checks]').prop('checked', counter % 2 == 0);
		counter++;
	});
});

$(function() {$('input[name=button_U]').click(function() {
	window.location.reload();
	});
});