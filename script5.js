// conditional statements 

// if else 
// else if 


// if( condition){
// code
// }else {
// code
// } 



//------------------- check which is bigger number --------------------
let a =10;
let b =15;

if( a > b){
console.log( " A is bigger then B");
}else{ 
    console.log ( " B is bigger then A ");
}


// check a number is even number or off number 
// in order to check num1 shoould be divisble by 2 then its even or else odd 

let num1 = 135;

let A =135;
let B =120

if(B%2===0){
    console.log( " even number ")
} else{ 
    console.log( " odd number ")
}

// check if given time is dinner time or not : dinner time is 8;
// lets go for dinner 
// wait

let time= 6;

if(time == 8){
    console.log("Dinner time!");
}else if(time < 8){
    console.log("wait!");
}else if(time > 8){
    console.log( " dinner time")
}


//red => stop 
// green ==> go 
//yellow==> slow down 
//anyother color => invalid input 


let trafficlight = "red"

if ( trafficlight == "red"){
    console.log( "stop");
}
else if ( trafficlight == "green"){
    console.log( "go");
}else if ( trafficlight == "yellow"){
console.log( "slow down");
}else{ console.log( "invalid input");}

  //swich 
    // switch expression 
    // case x:
    //code
    //break;
    // code
    //defult
    // code
    // break;
    //} 

    switch( trafficlight){
case "red":
    //code
    console.log( " stop, its from switch");
    break;
    case "green":
    console.log(" go, its from switch");
    break; 
    case "yellow":
        console.log ("slow down, its from switch");
        break;
fault:
console.log(" invaild input, its from the switch");
break;
}
//----------------------------loops-------------------------//

//while loop


while(condition){

//logic code
// increase or decrease
}

// 1, 2, 3, 4, 5,7, 8,9,10

let i=1;

while(i <=10){
console.log(i);
i++;

}

























// for loops 
// while loops
// do while loops

// for ( inilization ; condition increment / decrement ){
// code => n number of times 
//}


let number4=100;

for( let loopcount=0; loopcount <10 ; loopcount++){

    //code
    numb4++;
    console.log(numb4)


}
      
// create a number from 500, 499 , 498......400;

for( let num = 500;  num > 399; num--){
console.log(num);
}




// write a code 333, 330, 327, ......................30

for( let i =333; i >=30; i=i-333){
console.log( i);

}


