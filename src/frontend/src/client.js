import fetch from 'unfetch';

//
const checkStatus = response => {
    // If status code 200 ('ok') we return response
    if (response.ok) {
        return response;
    }
    // Otherwise reject with an error and return response as error and then promise
    // convert non-2xx HTTP responses into errors:
    const error = new Error(response.statusText);
    error.response = response;
    return Promise.reject(error);
}

export const getAllStudents = () =>
    fetch("api/v1/students")
        .then(checkStatus);