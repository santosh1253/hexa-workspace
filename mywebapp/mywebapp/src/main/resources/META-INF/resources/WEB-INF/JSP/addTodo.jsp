
<%@include file="common/header.jspf"%>
<%@include file="common/naviagation.jspf"%>
<div class="container">
	<h3>Enter Todo Details:</h3>
	<form:form method="post" modelAttribute="todo">
		<fieldset class="mb-3">
			<form:label path="description">Enter Description:</form:label>
			<form:input type="text" path="description" required="required" />
			<form:errors path="description" />
		</fieldset>
		<fieldset class="mb-3">
			<form:label path="targetDate">Enter Date:</form:label>
			<form:input type="text" path="targetDate" required="required" />
			<form:errors path="targetDate" />
		</fieldset>
		<form:input type="hidden" path="id" />
		<br>
		<form:input type="hidden" path="done" />
		<br>
		<form:input type="hidden" path="username" />
		<br>
		<input type="submit" class="btn btn-success">
	</form:form>

</div>
<%@include file="common/footer.jspf"%>
<script>
	$('#targetDate').datepicker({
		format : 'yyyy/mm/dd',
		startDate : '-3d'
	});
</script>
</body>
</html>
