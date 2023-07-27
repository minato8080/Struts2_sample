/**
 * ListPageのbutton_A　全選択処理
 * ListPageのbutton_U　更新処理
 * ListPageのbutton_N　新規処理
 */
var a_counter = 0;
var n_counter = 0;

$(function() {
	$('input[name=button_A]').click(function() {
		$('input[class=checks]').prop('checked', a_counter % 2 == 0);
		a_counter++;
	});
});

$(function() {$('input[name=button_U]').click(function() {
	window.location.reload();
	});
});

$(function() {$('input[name=button_N]').click(function() {
	var add_point = document.getElementById('operation_table');
	var add_text=
	`<tr>` +
		`<td><input type="checkbox" name="n_checked_list" class="checks"value="${n_counter}"form="update" /></td>`+
		`<td><input type="text" name="n_id" size="1"form="update" /></td>`+
		`<td><input type="text" name="n_name" size="12"form="update" /></td>`+
		`<td><input type="text" name="n_stock" size="4"form="update" /></td>`+
		`<td><select name="n_secret"form="update" />`+
			`<option value="true" label="o"/>`+
			`<option value="true" label="x"/></td>`+
		`<td><select name="n_editable"form="update" />`+
			`<option value="true" label="o"/>`+
			`<option value="true" label="x"/></td>`+
	`</tr>`	
	;
	
	add_point.insertAdjacentHTML('beforeend',add_text);
	
	n_counter++;
	});
});