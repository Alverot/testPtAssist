import axios from 'axios';
export default axios.create({
        baseURL:'com.exampleAlexandru.Department',
        headers:{"ngrok-skip-browser-warning":"true"}
    }
);