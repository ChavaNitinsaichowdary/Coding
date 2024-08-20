/**
 * @param {Array<Function>} functions
 * @return {Promise<any>}
 */
var promiseAll = function(functions) {
    return new Promise((resolve,reject)=>{
        let res = [];
        let count = 0;
        for(let i = 0;i<functions.length;i++){
            functions[i]().then(val=>{
                res[i] = val;
                count++;
                if(count === functions.length)resolve(res);
            }).catch(val=>reject(val));
        }
    })
    
};

/**
 * const promise = promiseAll([() => new Promise(res => res(42))])
 * promise.then(console.log); // [42]
 */