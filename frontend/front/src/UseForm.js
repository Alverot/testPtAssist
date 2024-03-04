import React, { useState } from 'react';
import axios from 'axios';

const UserForm = () => {
    const [name, setName] = useState('');
    const handleSubmit = async (e) => {
        e.preventDefault();
        try {
            await axios.post('/api/employee', name);
            alert('Utilizator adăugat cu succes!');
            setName('');
        } catch (error) {
            alert('Eroare la adăugarea utilizatorului!');
        }
    };

    return (
        <form onSubmit={handleSubmit}>
            <input type="text" placeholder="Nume" value={name} onChange={(e) => setName(e.target.value)} required />
            <button type="submit">Adaugă utilizator</button>
        </form>
    );
};

export default UserForm;