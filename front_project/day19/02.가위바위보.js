var SCISSORS = "가위";
var ROCK = "바위";
var PAPER = "보";

var userInput = prompt("가위, 바위, 보!");
        //입력한 사용자의 값을 검증(유효성 검사) : 가위 바위 보 이외에 다른 값을 입력하면 '다시 입력하라'는 문구가 나타나도록 할 것
        if(userInput != "SCISSORS" && userInput != "ROCK" && userInput != "PAPER") { // or 또는 and 사용
            alert("가위 바위 보 중 하나를 입력하세요")
        } else {
            var comInput;
            var random = Math.random();
            if(random<0.33) {
                comInput = "SCISSORS";
            } else if(random<0.66) {
                comInput = "ROCK";
            } else {
                comInput = "PAPER";
            }

            if(userInput === "SCISSORS") {
                if(comInput === "SCISSORS") {
                    alert("컴퓨터:"+comInput+"-컴퓨터와 비겼습니다.")
                } else if(comInput === "ROCK") {
                    alert("컴퓨터:"+comInput+"-컴퓨터에게 졌습니다.")
                } else
                    alert("컴퓨터:"+comInput+"-컴퓨터에게 이겼습니다.")                
            }
            else if(userInput === "ROCK") {
                if(comInput === "SCISSORS") {
                    alert("컴퓨터:"+comInput+"-컴퓨터에게 이겼습니다.")
                } else if(comInput === "ROCK") {
                    alert("컴퓨터:"+comInput+"-컴퓨터와 비겼습니다.")
                } else
                    alert("컴퓨터:"+comInput+"-컴퓨터에게 졌습니다.")     
            }
            else{
                if(comInput === "SCISSORS") {
                    alert("컴퓨터:"+comInput+"-컴퓨터에게 졌습니다.")
                } else if(comInput === "ROCK") {
                    alert("컴퓨터:"+comInput+"-컴퓨터를 이겼습니다.")
                } else
                    alert("컴퓨터:"+comInput+"-컴퓨터와 비겼습니다.")  
            }
        }