# spring_legacy_MVC_jdk1.8


## Spirng Legacy Project
	- 이번 프로젝트는 java 1.8을 이용한 프로젝트임.

## 1. porm.xml 수정
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