import localFont from 'next/font/local'
import "./globals.css";
import Link from 'next/link';

const fontWeb = localFont({ src: '../../public/font/arial_rounded.ttf' })

export const metadata = {
  title: "...",
  description: "...",
};
export default function RootLayout({ children }) {
  return (
    <html lang="en" className="scroll-smooth">
      <body className={fontWeb.className}> 
        {children} 
      </body>
    </html>
  );
}
