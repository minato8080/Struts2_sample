<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>確認書の表示</title>

<!-- jQuery -->
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>

<!-- ページ内アクション -->
<script src="js/ListPageButtons.js"></script>

</head>
<body>
		<table style="text-align: center;border-collapse: collapse" border="1">
			<thead>
				<th style="width: 100px;">id</th>
				<th style="width: 300px;">製品名</th>
				<th style="width: 100px;">在庫数</th>
				<th style="width: 100px;">単価</th>
			</thead>
			<tbody>
				<s:iterator value="checked_list" var="ch" status="st">
					<tr>
						<td>${products[ch].id}</td>
						<td>${products[ch].name}</td>
						<td>${products[ch].stock}</td>
						<td>${products[ch].price}</td>
					</tr>
				</s:iterator>
				<tr>
					<td>総数</td>
					<td>${checked_list.size()}</td>
					<td>合計</td>
					<td>${sumPrice}</td>
				</tr>
			<table style="text-align: end" border="1">
				<tr>
					<td style="width: 200px;">工場：${select_factory}</td>
					<td style="width: 200px;">担当者：${select_person}</td>
					<td style="width: 200px;">注文日：${select_date}</td>
				</tr>
			</table>
		</tbody>
		</table>
	</div>
</body>
</html>