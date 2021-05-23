<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="../include/header.jsp"%>

<!-- 오시는 길-->


<!-- 카카오 맵 -->
<section>
	<div id="map"
		style="width: 50%; height: 400px; margin: 0 auto; margin-top: 50px"></div>
</section>

<script type="text/javascript"
	src="//dapi.kakao.com/v2/maps/sdk.js?appkey=e2eea98809b729761b0f5d5b5b37c3b8"></script>
<script>
	var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
	mapOption = {
		center : new kakao.maps.LatLng(37.514757, 126.776307), // 지도의 중심좌표
		level : 3
	// 지도의 확대 레벨
	};

	// 지도를 표시할 div와  지도 옵션으로  지도를 생성합니다
	var map = new kakao.maps.Map(mapContainer, mapOption);

	//마커가 표시될 위치입니다 
	var markerPosition = new kakao.maps.LatLng(37.514757, 126.776307);

	// 마커를 생성합니다
	var marker = new kakao.maps.Marker({
		position : markerPosition
	});

	// 마커가 지도 위에 표시되도록 설정합니다
	marker.setMap(map);

	var iwContent = '<div style="padding:5px; text-align : center;"> 비즈플러스 글로벌', // 인포윈도우에 표출될 내용으로 HTML 문자열이나 document element가 가능합니다
	iwPosition = new kakao.maps.LatLng(37.514757, 126.776307); //인포윈도우 표시 위치입니다

	//인포윈도우를 생성합니다
	var infowindow = new kakao.maps.InfoWindow({
		position : iwPosition,
		content : iwContent
	});

	//마커 위에 인포윈도우를 표시합니다. 두번째 파라미터인 marker를 넣어주지 않으면 지도 위에 표시됩니다
	infowindow.open(map, marker);
	
	// 일반 지도와 스카이뷰로 지도 타입을 전환할 수 있는 지도타입 컨트롤을 생성합니다
	var mapTypeControl = new kakao.maps.MapTypeControl();

	// 지도에 컨트롤을 추가해야 지도위에 표시됩니다
	// kakao.maps.ControlPosition은 컨트롤이 표시될 위치를 정의하는데 TOPRIGHT는 오른쪽 위를 의미합니다
	map.addControl(mapTypeControl, kakao.maps.ControlPosition.TOPRIGHT);

	// 지도 확대 축소를 제어할 수 있는  줌 컨트롤을 생성합니다
	var zoomControl = new kakao.maps.ZoomControl();
	map.addControl(zoomControl, kakao.maps.ControlPosition.RIGHT);
</script>

<section id="team">
	<div>
		<div class="section-title" data-aos="fade-up">
			<h2>
				<strong>오시는 길</strong>
			</h2>
			<p>부천시 경기 부천시 수도로 88-15</p>
			<p>디클래스 류 빌딩 4층 비즈플러스 글로벌</p>
		</div>
	</div>
</section>











<%@include file="../include/footer.jsp"%>