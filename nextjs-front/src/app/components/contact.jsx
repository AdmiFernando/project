import React, { useState, useEffect } from 'react';

const Contact = () => {
    // Effect Visible Section
  const [isVisible, setIsVisible] = useState(false);
  useEffect(() => {
    setIsVisible(true);
  }, []);
//   Send Email
    const [name, setName] = useState('');
    const [email, setEmail] = useState('');
    const [message, setMessage] = useState('');
    const [phone, setPhone] = useState('');

    const handleSubmit = (e) => {
        e.preventDefault();
        alert('Form submitted!',  { name, email, message, phone });
        setName('');
        setEmail('');
        setMessage('');
        setPhone('');
    };

    // const handleSubmit = (e) => {
    //     e.preventDefault();
    
    //     emailjs.send('YOUR_SERVICE_ID', 'YOUR_TEMPLATE_ID', { name, email, message, phone }, 'YOUR_USER_ID')
    //       .then((response) => {
    //          console.log('SUCCESS!', response.status, response.text);
    //          alert('Form submitted!');
    //          setName('');
    //          setEmail('');
    //          setMessage('');
    //          setPhone('');
    //       }, (err) => {
    //          console.log('FAILED...', err);
    //          alert('Failed to send form. ' + err);
    //       });
    //   };

    return (
        <section id='contact'  className={`my-component ${isVisible ? 'fade-enter-active' : 'fade-exit-active'}`}>
            <div className="contact">
            <h2>Contacto</h2>
            <form onSubmit={handleSubmit}>
                <h3>SEND A MESSAGE</h3>`
                <div id="form">
                    <div id="form-group">
                    <div>
                    <label htmlFor="name">Name:</label>
                    <input
                        type="text"
                        id="name"
                        value={name}
                        onChange={(e) => setName(e.target.value)}
                    />
                </div>
                <div>
                    <label htmlFor="email">Email:</label>
                    <input
                        type="email"
                        id="email"
                        value={email}
                        onChange={(e) => setEmail(e.target.value)}
                    />
                </div>
                <div>
                    <label htmlFor="phone">Phone:</label>
                    <input
                        type="phone"
                        id="phone"
                        value={phone}
                        onChange={(e) => setPhone(e.target.value)}
                    />
                </div>
                    </div>
                <div>
                    <label htmlFor="message">Message:</label>
                    <textarea
                        id="message"
                        cols={30}
                        rows={5}
                        value={message}
                        onChange={(e) => setMessage(e.target.value)}
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