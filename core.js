// const path = require("path");
// const dirUpload = path.join(__dirname, "www", "files", "uploads");
// console.log(dirUpload);
//  const util = require("util");
//  util.log(path.basename(__filename));
//  util.log("^ the name of the current file");
//  const v8 = require ("v8");
// object destructuring
// const {getHeapStatistics}= require("v8");
// const {log} = require ("util")
//  log(getHeapStatistics());

// readline 
// const readline = require ("readline");
// const rl = readline.createInterface({
//     input :process.stdin,
//     output :process.stdout
// });
// rl.question("how do you like Node?", answer =>{
//     console.log(`Your answer is : ${answer}`);
// });
// const events = require("events");
// const { log } = require("console");
// const emitter = new events.EventEmitter();

// // event handler takes an callback function 
// emitter.on("customEvent", (message, user)=>{
// console.log(`${user}: ${message}`);
// })
// // takes name of the event string
// // emitter.emit("customEvent", "Hello World", "Computer");
// // emitter.emit("customEvent", "That's preety cool huh?", "Alex");
// // lets implement through the terminal vis stdin
// process.stdin.on("data", data =>{
//   const input = data.toString().trim(); 
//   if (input ==="exit") {
//       emitter.emitr("customEvent", "Goodbye!!!! ", "process")
//     process.exit();
//   }
//   emitter.emit("customEvent", input, "terminal");
// })

// write function to check whether the two elements of array has sum equals to 5 or not.

// write the function to check the sum of two elements of an arrat is equal to 5 or not.

const arr = [-1,3, -4, 5, 6, 7, 8, -9, 10];
function sum(arr){

    for(let i = 0; i < arr.length; i++){
        //console.log(arr[i]);
      for (let j = 0; j < arr.length; j++) {
        //console.log(arr[j]);
        if (arr[i] + arr[j] === 5) {
          
          return true;
        }
        //console.log(arr[i] + arr[j]);
        
      }
    }
    
}
console.log(sum(arr));

function check(){
  return(100/0);
}
  console.log(check());

