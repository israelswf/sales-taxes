import React from 'react'

    const Items = ({ items }) => {
      return (
        <div className='items'>
          <h1>Items List</h1>
          <select>
          {items.map((item) => (
            <option key={item.id} value={item.id}>{item.name}: {item.price}</option>
          ))}
          </select>
        </div>
      )
    };

    export default Items