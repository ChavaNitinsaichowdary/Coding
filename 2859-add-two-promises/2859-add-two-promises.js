/**
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */
var addTwoPromises = async function(promise1, promise2) {
    return new Promise((resolve)=>{
        let x,y;
        promise1.then((num1)=>{
            x = num1;
            promise2.then((num2)=>{
                y= num2;
            }).then(()=>{
                resolve(x+y);
            })
        });
       
        
    })
};

/**
 * addTwoPromises(Promise.resolve(2), Promise.resolve(2))
 *   .then(console.log); // 4
 */