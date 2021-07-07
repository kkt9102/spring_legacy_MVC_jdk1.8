# spring_legacy_MVC_jdk1.8


## Spirng Legacy Project
	- 이번 프로젝트는 java 1.8을 이용한 프로젝트임.

## 1. porm.xml 수정
	- Java 는 1.8버전으로 변겅
	- Spring RELEASE는 4.1.13.버전으로 변경
[코드 보러가기](markdown_list/porm.xml_edit.md)

---

## 2. 한글 필터링 추가
	- 한글 필터링 코드
	```java
		<!-- 한글필터링 -->
		<filter>
			<filter-name>encodingFilter</filter-name>
			<filter-class>org.springframework.web.filter.CharacterEncodingFilter
			</filter-class>
		
			<init-param>
				<param-name>encoding</param-name>
				<param-value>UTF-8</param-value>
			</init-param>
		
			<init-param>
				<param-name>forceEncoding</param-name>
				<param-value>true</param-value>
			</init-param>
		</filter>
			<filter-mapping>
				<filter-name>encodingFilter</filter-name>
				<url-pattern>/*</url-pattern>
			</filter-mapping>
	```
[추가 후 코드 보러가기](markdown_list/web.xml_edit.md)

---

## 3. tomcat 8.0 Root 경로 설정
<div>
	<img src="https://kkt9102.github.io/img2/spring_legacy_java1.8/1.png" style="width:1000px;">
	<br>
	<p>1. 경로를 바꿀 tomcat의 설정을 열어 modules 탭을 클릭</p>
	<br>
	<img src="https://kkt9102.github.io/img2/spring_legacy_java1.8/2.png" style="width:800px;">
	<br>
	<p>2. 해당 프로젝트 선택 후 Edit을 통하여 Path 부분에 <span style="font-size:1.3rem; font-weight:bold;">/controller</span>에서 <span style="font-size:1.3rem; font-weight:bold;">controller</span>만 삭제 후 저장</p>
</div>

---

## 4. ArticleController.java 추가
