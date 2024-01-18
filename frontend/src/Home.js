import React from "react";
const Home = () =>{
    
    const handleKakaoLoginClick = () =>{
        window.location.href = `https://kauth.kakao.com/oauth/authorize?client_id=${process.env.REACT_APP_KAKAO_REST_API_KEY}&redirect_uri=${process.env.REACT_APP_REDIRECT_URI}&response_type=code`;
    }
    return(
        <div>
    
            <button onClick={handleKakaoLoginClick}>
                카카오로그인
            </button>
    
        </div>
    
    
    )
}



export default Home;