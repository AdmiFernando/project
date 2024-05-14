import "./globals.css";

export const metadata = {
  title: "Scratch Coding Solutions",
  description: "...",
};

export default function RootLayout({ children }) {
  return (
    <html lang="en" className="scroll-smooth">
      <body> 
        {children} 
      </body>
    </html>
  );
}
