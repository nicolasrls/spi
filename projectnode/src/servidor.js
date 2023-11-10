const express = require('express');

const app = express();

app.use(express.json());

app.get('/', (request,response) => {
    response.json({name : 'walter', age : 21});
})

app.post('/userdata',(request,response) => {
    console.log(request.body)
    response.status(200).json({sucess:true})
})

app.listen(4000);

