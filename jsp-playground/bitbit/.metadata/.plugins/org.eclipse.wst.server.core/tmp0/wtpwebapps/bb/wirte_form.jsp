<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글작성 페이지</title>
</head>
<body>
        <center>
        <hr width=400 color="green">
        <h1>글 작성</h1>
        <hr width=400 color="green">
        <table border=1 cellspacing=0 color="green" width=400>
           <form action="write.do" method="post">
                <tr><td>작성자</td><td><input type="text" name="bName" size="40"></td></tr>
                <tr><td>제목</td><td><input type="text" name="bTitle" size="40"></td></tr>
                <tr><td>내용</td><td><TextArea type="text" name="bContent" row="5" cols="45"></TextArea></td></tr>
                <tr><td><input type="submit" value="저장" name="전송"><input type="reset" value="취소" name="취소"></td><td><a href="list.do">목록으로</a></td></tr>
            </form>
        </table>
        </center>
</body>
</html>