<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>出荷計上一覧</title>

<!-- jQuery -->
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>

<!-- ページ内アクション -->
<script src="js/ListPageButtonA.js"></script>

<!-- flatpickr -->
<link rel="stylesheet" href="//unpkg.com/flatpickr/dist/flatpickr.min.css">
<link rel="stylesheet" type="text/css" href="https://npmcdn.com/flatpickr/dist/themes/airbnb.css">
<script src="//unpkg.com/flatpickr"></script>
<script src="//unpkg.com/flatpickr/dist/l10n/ja.js"></script>

</head>
<body>
	出荷計上一覧
	<div class="container" style="display: flex">
		<table border="1">
			<!-- selectタグ未使用 -->
			<%-- <tr>
				<td>工場</td>
				<td><select name="factoryname0" style="width: 100px">
						<option value="null" />
						<s:iterator value="factory" var="f" status="st">
							<option value="factory${st.index}">${f}</option>
						</s:iterator>
				</select></td>
			</tr> --%>
			<!-- selectタグ使用 -->
			<tr>
				<s:select label="工場" name="factoryname" headerKey="1" headerValue=""
					list="factory" style="width: 100px" />
			</tr>
			<tr>
				<s:select label="担当者" name="personname" headerKey="1" headerValue=""
					list="person" style="width: 100px" />
			</tr>
			<tr>
				<td>日付</td>
				<td><input class="input" id="myCal" type="text" style="width: 92px"/></td>
				<script>flatpickr("#myCal", {locale : "ja"});</script>
				<%-- <td><s:date name="date" format="yyyy/MM/dd" /></td> --%>
			</tr>
		</table>
		<table border="1">
			<tr>
				<td>納品先</td>
				<td style="width: 200px"><s:property value="deliver" /></td>
			</tr>
			<tr>
				<td>請求先</td>
				<td style="width: 200px"><s:property value="bill" /></td>
			</tr>
		</table>
		<table border="1">
			<tr>
				<td>完<br>了
				</td>
				<td><input type="checkbox" name="master_check" /></td>
			</tr>
		</table>
	</div>


	<div class="container" style="display: flex">
		<div>
			<s:submit value="検索(S)" name="button_S" />
		</div>
		<div>
			<s:submit value="新規(N)" name="button_N" />
		</div>
		<div>
			<s:submit value="一括(A)" name="button_A" accesskey="a"/><!-- 実装済み -->
		</div>
		<div>
			<s:submit value="取込(G)" name="button_G" />
		</div>
		<div>
			<s:submit value="納品書(P)" name="button_P" />
		</div>
		<div>
			<s:submit value="確認書(L)" name="button_L" />
		</div>
		<div>
			<s:submit value="抜出(T)" name="button_T" onclick="location.href='/Struts2/'"/>
		</div>
		<div>
			<s:form  action="list">
				<s:submit value="更新(U)" name="button_U" accesskey="u"/><!-- 実装済み -->
			</s:form>
		</div>
	</div>

	<div class="container" style="height: 300px; overflow: scroll;">
		<table border="1" style="text-align: center">
			<thead
				style="position: sticky; top: 0; left: 0; background-color: white;">
				<th>選</th>
				<th>id</th>
				<th>製品名</th>
				<th>在庫数</th>
				<th>公開可？</th>
				<th>編集可？</th>
			</thead>
			<tbody>
				<s:iterator value="products" var="p" status="st">
					<tr>
						<td><input type="checkbox" name="checkbox${st.index}"
							class="checks" /></td>
						<td><s:property value="id" /></td>
						<td><s:property value="name" /></td>
						<td><s:property value="stock" /></td>
						<td><s:property value="#p.secret?'o':'x'" /></td>
						<td><s:property value="#p.editable?'o':'x'" /></td>
					</tr>
				</s:iterator>
			</tbody>
		</table>
	</div>
</body>
</html>