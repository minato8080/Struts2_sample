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
	<div class="container" style="display: flex">
		<div>
			<s:submit value="抜出(T)" name="button_T"
				onclick="location.href='/Struts2/'" />
		</div>
		<div>
			<s:submit value="更新(U)" name="button_U" accesskey="u" />
		</div>
	</div>

	<div class="container">
		<table style="text-align: center">
			<thead>
				<th>id</th>
				<th>製品名</th>
				<th>在庫数</th>
				<th>単価</th>
			</thead>
			<tbody>
				<s:iterator value="checkedList" var="ch" status="st">
					<tr>
						<td>${products[ch].id}</td>
						<td>${products[ch].name}</td>
						<td>${products[ch].stock}</td>
						<td>${products[ch].price}</td>
					</tr>
				</s:iterator>
				<tr>
					<td>総数</td>
					<td>${checkedList.size()}</td>
					<td>合計</td>
					<td>${sumPrice}</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>