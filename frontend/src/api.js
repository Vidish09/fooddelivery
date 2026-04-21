import axios from "axios";

const API = "http://localhost:8080/api";

export const getFoods = () => axios.get(`${API}/foods`);
export const addFood = (food) => axios.post(`${API}/foods`, food);