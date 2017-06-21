<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<jsp:include page="/common/header.jsp"></jsp:include>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" href="./css/index.css" />
    <!--场景 PRJ-WTP-WEB-035  直达顶部火箭【3/3 START】-->
    <link rel="stylesheet" href="./css/toTop.css" />
    <!--场景 PRJ-WTP-WEB-035  直达顶部火箭【3/3 END】-->
    <link href="css/index.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" href="common/css/common.css">

    <script src="js/jquery-1.10.2.min.js"></script>
    <script src="js/top.js"></script>

    <script type="text/javascript">
    function movein(x){
        x.style.fontSize="14px";
    }

    function moveout(y){
        y.style.fontSize="12px";
    }
    </script>

</head>
<body onload="time()" >
<!-- <iframe src="common/header.jsp" width="100%" height="200px" frameborder="0" scrolling="no"></iframe>-->
<!-- 顶端 -->


<!-- 内容模块开始 -->
<div id="2" class="public-box" data-count-first="国内游">
    <div class="public-tit">
        <h3><strong>国内游</strong><span>拎包就走,轻松出游</span></h3>
        <a class="public-tit-more fr" href="../trip/search.html" target="_blank">更多周边游</a></div>

    <!-- 公共左边导航模块开始 -->
    <div class="public-asidebg" data-count-first="左侧导航">
        <div class="public-asidenav">
            <div class="min-title">热点景点</div>
            <!-- 导航栏内容部分 -->
            <div class="navigation-content">
                <center>
                    <table class="navigation-table">
                    	<s:iterator value="places" id="place" status="st">
                    		<s:if test="#st.index % 2 == 0">
                    			<tr>
                    		</s:if>
                    			<s:if test="#st.index % 2 == 0">
                    				<s:if test="#st.index == 0">
                    					<td align="right"  width="100px">
                    				</s:if>
                    				<s:else>
                    					<td align="right">
                    				</s:else>
                    			</s:if>
                    			<s:else>
                    				<s:if test="#st.index == 1">
                    					<td width="30px"></td>
                    					<td align="left"  width="100px">
                    				</s:if>
                    				<s:else>
                    					<td></td>	
                    					<td align="left">
                    				</s:else>	
                    			</s:else>
                    				<a href="../trip/search.html"><s:property value="#place.getName()" /></a></td>
	               			<s:if test="#st.index % 2 != 0">
	               				</tr>
	               			</s:if>
                    	</s:iterator>
                       
                    </table>
                </center>
            </div>
            <div class="line1_style">
                <img src="images/line1.png" width="23px" height="211px" alt=""/>
            </div>

            <div class="min-title">热门主题</div>
            <div class="navigation-content">
                <center>
                <table class="navigation-table">
                    <s:iterator value="themes" id="theme" status="st">
                    		<s:if test="#st.index % 2 == 0">
                    			<tr>
                    		</s:if>
                    			<s:if test="#st.index % 2 == 0">
                    				<s:if test="#st.index == 0">
                    					<td align="right"  width="100px">
                    				</s:if>
                    				<s:else>
                    					<td align="right">
                    				</s:else>
                    			</s:if>
                    			<s:else>
                    				<s:if test="#st.index == 1">
                    					<td width="30px"></td>
                    					<td align="left"  width="100px">
                    				</s:if>
                    				<s:else>
                    					<td></td>	
                    					<td align="left">
                    				</s:else>	
                    			</s:else>
                    				<a href="../trip/search.html"><s:property value="#theme.getName()" /></a></td>
	               			<s:if test="#st.index % 2 != 0">
	               				</tr>
	               			</s:if>
                    	</s:iterator>
                    </table>
                </center>
            </div>
            <div class="line2_style">
                <img src="./images/line2.png" width="23px" height="184px" alt=""/>
            </div>
        </div>

    </div>
    <!-- 公共左边导航模块结束 -->

    <!-- 自由行侧边产品list -->
    <div class="public-pro fls freedomWalk-detail" id="freedomWalk-detail1" data-count-first="右侧图片列表">
        <div class="pro-list">
            <ul>
            	<s:iterator value="trips" id="trip">
            		<li>
                    <div class="pro_list_content">
                         <p>
 
                         		<img src="image_cache/<s:property value="#trip.trippictures.get(0).getName()" />" width="290" height="200" border="1"> 
							
                        </p>
                        <p onmouseover="movein(this)" onmouseout="moveout(this)">
							<span class="pro-list-price fr">
								<span>￥</span>
								<span><s:property value="#trip.prices.get(0).getPrice()" /></span>&nbsp;起
							</span> 
							<span><s:property value="#trip.trip.getSTitle()" /></span>
                        </p>

                    </div>
                </li>
            	</s:iterator>
                
               
            </ul>
        </div>
    </div>

</div>
<div id="3" class="public-box" data-count-first="境外游">
    <div class="public-tit">
        <h3><strong>境外游</strong><span>世界有多大，我就玩多远</span></h3>
        <a class="public-tit-more fr" href="../trip/search.html" target="_blank">更多周边游</a></div>

    <!-- 公共左边导航模块开始 -->
    <div class="public-asidebg" data-count-first="左侧导航">
        <div class="public-asidenav">
            <div class="min-title">热门景点</div>
            <!-- 导航栏内容部分 -->
            <div class="navigation-content">
                <center>
                    <table class="navigation-table">
                        <s:iterator value="inter_places" id="inter_place" status="st">
                    		<s:if test="#st.index % 2 == 0">
                    			<tr>
                    		</s:if>
                    			<s:if test="#st.index % 2 == 0">
                    				<s:if test="#st.index == 0">
                    					<td align="right"  width="100px">
                    				</s:if>
                    				<s:else>
                    					<td align="right">
                    				</s:else>
                    			</s:if>
                    			<s:else>
                    				<s:if test="#st.index == 1">
                    					<td width="30px"></td>
                    					<td align="left"  width="100px">
                    				</s:if>
                    				<s:else>
                    					<td></td>	
                    					<td align="left">
                    				</s:else>	
                    			</s:else>
                    				<a href="../trip/search.html"><s:property value="#inter_place.getName()" /></a></td>
	               			<s:if test="#st.index % 2 != 0">
	               				</tr>
	               			</s:if>
                    	</s:iterator>
                    </table>
                </center>
            </div>
            <div class="line1_style">
                <img src="./images/line1.png" width="23px" height="211px" alt=""/>
            </div>

            <div class="min-title">热门主题</div>
            <div class="navigation-content">
                <center>
                    <table class="navigation-table">
                        <s:iterator value="inter_themes" id="inter_theme" status="st">
                    		<s:if test="#st.index % 2 == 0">
                    			<tr>
                    		</s:if>
                    			<s:if test="#st.index % 2 == 0">
                    				<s:if test="#st.index == 0">
                    					<td align="right"  width="100px">
                    				</s:if>
                    				<s:else>
                    					<td align="right">
                    				</s:else>
                    			</s:if>
                    			<s:else>
                    				<s:if test="#st.index == 1">
                    					<td width="30px"></td>
                    					<td align="left"  width="100px">
                    				</s:if>
                    				<s:else>
                    					<td></td>	
                    					<td align="left">
                    				</s:else>	
                    			</s:else>
                    				<a href="../trip/search.html"><s:property value="#inter_theme.getName()" /></a></td>
	               			<s:if test="#st.index % 2 != 0">
	               				</tr>
	               			</s:if>
                    	</s:iterator>
                    </table>
                </center>
            </div>
            <div class="line2_style">
                <img src="./images/line2.png" width="23px" height="184px" alt=""/>
            </div>
        </div>

    </div>
    <!-- 公共左边导航模块结束 -->

    <!-- 自由行侧边产品list -->
    <div class="public-pro fls freedomWalk-detail" id="freedomWalk-detail2" data-count-first="右侧图片列表">
        <!--周末游推荐景点-->
        <div class="pro-list">
            <ul>
                <s:iterator value="inter_trips" id="inter_trip">
            		<li>
                    <div class="pro_list_content">
                         <p>
 
                         		<img src="image_cache/<s:property value="#inter_trip.trippictures.get(0).getName()" />" width="290" height="200" border="1"> 
							
                        </p>
                        <p onmouseover="movein(this)" onmouseout="moveout(this)">
							<span class="pro-list-price fr">
								<span>￥</span>
								<span><s:property value="#inter_trip.prices.get(0).getPrice()" /></span>&nbsp;起
							</span> 
							<span><s:property value="#inter_trip.trip.getSTitle()" /></span>
                        </p>

                    </div>
                </li>
            	</s:iterator>
            </ul>
        </div>
    </div>
</div>
<div id="4" class="public-box" data-count-first="自驾游">
    <div class="public-tit">
        <h3><strong>自驾游</strong><span>行走山水间，足迹遍中国</span></h3>
        <a class="public-tit-more fr" href="../trip/search.html" target="_blank">更多周边游</a></div>

    <!-- 公共左边导航模块开始 -->
    <div class="public-asidebg" data-count-first="左侧导航">
        <div class="public-asidenav">
            <div class="min-title">热门景点</div>
            <!-- 导航栏内容部分 -->
            <div class="navigation-content">
                <center>

                    <table class="navigation-table">
                        <s:iterator value="self_places" id="self_place" status="st">
                    		<s:if test="#st.index % 2 == 0">
                    			<tr>
                    		</s:if>
                    			<s:if test="#st.index % 2 == 0">
                    				<s:if test="#st.index == 0">
                    					<td align="right"  width="100px">
                    				</s:if>
                    				<s:else>
                    					<td align="right">
                    				</s:else>
                    			</s:if>
                    			<s:else>
                    				<s:if test="#st.index == 1">
                    					<td width="30px"></td>
                    					<td align="left"  width="100px">
                    				</s:if>
                    				<s:else>
                    					<td></td>	
                    					<td align="left">
                    				</s:else>	
                    			</s:else>
                    				<a href="../trip/search.html"><s:property value="#self_place.getName()" /></a></td>
	               			<s:if test="#st.index % 2 != 0">
	               				</tr>
	               			</s:if>
                    	</s:iterator>
                    </table>

                </center>
            </div>
            <div class="line1_style">
                <img src="./images/line1.png" width="23px" height="211px" alt=""/>
            </div>

            <div class="min-title">热门主题</div>
            <div class="navigation-content">
                <center>
                    <table class="navigation-table">
                        <s:iterator value="self_themes" id="self_theme" status="st">
                    		<s:if test="#st.index % 2 == 0">
                    			<tr>
                    		</s:if>
                    			<s:if test="#st.index % 2 == 0">
                    				<s:if test="#st.index == 0">
                    					<td align="right"  width="100px">
                    				</s:if>
                    				<s:else>
                    					<td align="right">
                    				</s:else>
                    			</s:if>
                    			<s:else>
                    				<s:if test="#st.index == 1">
                    					<td width="30px"></td>
                    					<td align="left"  width="100px">
                    				</s:if>
                    				<s:else>
                    					<td></td>	
                    					<td align="left">
                    				</s:else>	
                    			</s:else>
                    				<a href="../trip/search.html"><s:property value="#self_theme.getName()" /></a></td>
	               			<s:if test="#st.index % 2 != 0">
	               				</tr>
	               			</s:if>
                    	</s:iterator>
                    </table>
                </center>
            </div>
            <div class="line2_style">
                <img src="./images/line2.png" width="23px" height="184px" alt=""/>
            </div>
        </div>

    </div>
    <!-- 公共左边导航模块结束 -->

    <!-- 自由行侧边产品list -->
     <div class="public-pro fls freedomWalk-detail" id="freedomWalk-detail3" data-count-first="右侧图片列表">
         <!--周末游推荐景点-->
         <div class="pro-list">
            <ul>
				<s:iterator value="self_trips" id="self_trip">
            		<li>
                    <div class="pro_list_content">
                         <p>
 
                         		<img src="image_cache/<s:property value="#self_trip.trippictures.get(0).getName()" />" width="290" height="200" border="1"> 
							
                        </p>
                        <p onmouseover="movein(this)" onmouseout="moveout(this)">
							<span class="pro-list-price fr">
								<span>￥</span>
								<span><s:property value="#self_trip.prices.get(0).getPrice()" /></span>&nbsp;起
							</span> 
							<span><s:property value="#self_trip.trip.getSTitle()" /></span>
                        </p>

                    </div>
                </li>
            	</s:iterator>
            </ul>
        </div>
	</div>


</div>
<!-- 内容模块结束 -->
<!-- 小火箭置顶 开始 -->
<div style="display: none ;" id="rocket-to-top">
    <div style="opacity:0;display: block;" class="level-2"></div>
    <div class="level-3"></div>
</div>
<!-- 小火箭置顶  结束 -->

<!-- 引入尾部开始 -->
<iframe src="common/footer.jsp" width="100%" height="650" frameborder="0" scrolling="no"></iframe>
<!-- 引入尾部结束 -->

<!-- 左侧悬浮导航 -->
<div id="nav-right" class="nav-right">
    <div class="nav-right-nav">
        <ul class="clearfix">
            <a id="nav1" href="#1">
                <li id="dd"><h3>顶端</h3></li>
            </a>
            <a id="nav2" href="#2">
                <li id="gn"><h3>国内</h3></li>
            </a>
            <a id="nav3" href="#3">
                <li id="jw"><h3>境外</h3></li>
            </a>
            <a id="nav4" href="#4">
                <li id="zj" class="last"><h3>自驾</h3></li>
            </a>
        </ul>
    </div>
</div>

<script src="js/index.js"></script>
<script type="text/javascript">
    $(document).ready(function(){
        $('#nav1').click(function () {
            $("html,body").animate({
                scrollTop:$("#1").offset().top
            },1000)
        })
        $('#nav2').click(function () {
            $("html,body").animate({
                scrollTop:$("#2").offset().top
            },1000)
        })
        $('#nav3').click(function () {
            $("html,body").animate({
                scrollTop:$("#3").offset().top
            },1000)
        })
        $('#nav4').click(function () {
            $("html,body").animate({
                scrollTop:$("#4").offset().top
            },1000)
        })

        /*鼠标移入时图片向上，移出时图片还原 开始*/
            $(".pro_list_content").hover(function(){
                $(this).css("margin-top","-5px");
                $(this).css("transition","0.5s");
            },function(){
                $(this).css("margin-top","-0px");
                $(this).css("transition","0.5s");
            });
        /*鼠标移入时图片向上，移出时图片还原 开始*/
    })
</script>
</body>
</html>