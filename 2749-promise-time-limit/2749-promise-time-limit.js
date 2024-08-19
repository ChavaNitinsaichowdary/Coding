var timeLimit = function(fn, t) {
    return async function(...args) {
        return new Promise((resolve, reject) => {
            const id = setTimeout(()=>reject("Time Limit Exceeded"),t);
            const date = new Date();

            fn(...args).then((result) => {
                if (new Date() - date <= t) {
                    clearTimeout(id);
                    resolve(result);
                } else {
                    clearTimeout(id);
                    reject("Time Limit Exceeded");
                }
            }).catch(reject);
        });
    };
};

