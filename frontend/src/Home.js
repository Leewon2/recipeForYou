import React from "react";
import "./Home.css"
import "./fonts/fonts.css"
const Home = () =>{
    
    const handleKakaoLoginClick = () =>{
        window.location.href = `https://kauth.kakao.com/oauth/authorize?client_id=${process.env.REACT_APP_KAKAO_REST_API_KEY}&redirect_uri=${process.env.REACT_APP_REDIRECT_URI}&response_type=code`;
    }
    return(
        <div className="home-container">
            <div className="content-box">
        <div className="font-style">오늘 뭐 먹지?</div>
    
        <button onClick={handleKakaoLoginClick} className="kakao-login-btn">카카오로그인</button>
    </div>
    
        </div>
    
    
    )
}



export default Home;