import React, { useState, useEffect } from 'react';
import axios from 'axios';

const Contact = () => {
  function sendEmail(name, email, msg, phone) {
    axios.post('http://localhost:8080/api/sendMail', {
        name: name,
        email: email,
        phone: phone,
        msg: msg
    })
    .then(response => {
        console.log(response.data);
        alert('Message sent successfully!');
    })
    .catch(error => {
        console.error('Error:', error);
        alert('Error sending message');
    });
  }

    // Effect Visible Section
  const [isVisible, setIsVisible] = useState(false);
  useEffect(() => {
    setIsVisible(true);
  }, []);
//   Send Email
    const [name, setName] = useState('');
    const [email, setEmail] = useState('');
    const [msg, setMessage] = useState('');
    const [phone, setPhone] = useState('');

    const handleSubmit = (event) => {
      event.preventDefault();
      sendEmail(name, email, msg, phone);
  }
    
    return (
        <section id='contact'   className={`my-component ${isVisible ? 'fadeEnter' : 'fadeExit'}`}>
            <div className="contact">
            <h2>CONTACT</h2>
            <form onSubmit={handleSubmit}>
                <h3>SEND A MESSAGE</h3>`
                <div id="form">
                    <div id="form-group">
                    <div>
                    <label htmlFor="name">Name</label>
                    <input type="name" id='name' value={name} onChange={e => setName(e.target.value)} placeholder="Fernan......" required />
    
                </div>
                <div>
                    <label htmlFor="email">Email</label>
                    <input type="email" id='email' value={email} onChange={e => setEmail(e.target.value)} placeholder="example@gmail.com" required />
                </div>
                <div>
                    <label htmlFor="phone">Phone</label>
                    <input type="phone" id='phone' value={phone} onChange={e => setPhone(e.target.value)} placeholder="+1 101........" required />
                </div>
                    </div>
                <div>
                    <label htmlFor="message">Message</label>
                    <textarea
                        id="message"
                        cols={30}
                        rows={5}
                        value={msg}
                        onChange={e => setMessage(e.target.value)} placeholder="Hello......" required
                    ></textarea>
                </div>
                </div>
            
                <button type="submit">Send</button>
            </form>
            </div>
        </section>
    );
};

export default Contact;