import React, { useEffect, useState } from "react";
import { getFoods, addFood } from "./api";

function App() {
  const [foods, setFoods] = useState([]);
  const [name, setName] = useState("");
  const [price, setPrice] = useState("");

  useEffect(() => {
    loadFoods();
  }, []);

  const loadFoods = () => {
    getFoods().then(res => setFoods(res.data));
  };

  const handleAdd = () => {
    addFood({ name, price }).then(() => {
      setName("");
      setPrice("");
      loadFoods();
    });
  };

  return (
    <div style={{ padding: 20 }}>
      <h1>🍔 Food Delivery App</h1>

      <h3>Add Food</h3>
      <input
        placeholder="Food Name"
        value={name}
        onChange={e => setName(e.target.value)}
      />
      <input
        placeholder="Price"
        value={price}
        onChange={e => setPrice(e.target.value)}
      />
      <button onClick={handleAdd}>Add</button>

      <h3>Food List</h3>
      {foods.map(f => (
        <div key={f.id}>
          {f.name} - ₹{f.price}
        </div>
      ))}
    </div>
  );
}

export default App;