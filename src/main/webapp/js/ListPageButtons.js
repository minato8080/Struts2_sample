/**
 * リストページのボタン機能
 */

var aCnt = 0;
var nCnt = 0;

// ListPageのbutton_A　全選択処理
$(function() {
	$('input[name=button_A]').click(function() {
		$('input[class=checks]').prop('checked', aCnt % 2 == 0);
		aCnt++;
	});
});

// ListPageのbutton_U　更新処理
$(function() {
	$('input[name=button_U]').click(function() {
		window.location.reload();
	});
});

// ListPageのbutton_N　新規処理
$(function() {
	$('input[name=button_N]').click(function() {
		var addPoint = document.getElementById('operation_table');
	
		var stockOptionElements = "";
		var numMax = 100;
		for (var i = 0; i <= numMax ; i++){
			stockOptionElements += `<option value="${i}" label="${i}" />`;
		}
		
		var addElements =
		`<tr>` +
			`<td><input type="checkbox" name="n_checked_list" class="checks"value="${nCnt}"form="update" /></td>`+
			`<td><input type="text" name="n_id" maxlength="3" size="1"form="update" /></td>`+
			`<td><input type="text" name="n_name" maxlength="10" size="12"form="update" /></td>`+
			`<td><select name="n_stock" form="update" />${stockOptionElements}</td>`+
			`<td><select name="n_secret"form="update" />`+
				`<option value="true" label="o"/>`+
				`<option value="false" label="x"/></td>`+
			`<td><select name="n_editable"form="update" />`+
				`<option value="true" label="o"/>`+
				`<option value="false" label="x"/></td>`+
		`</tr>`
		;
		
		addPoint.insertAdjacentHTML('beforeend',addElements);
		
		nCnt++;
	});
});
