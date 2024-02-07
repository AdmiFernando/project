// import { Roboto } from "next/font/google";
import "./globals.css";

// const roboto = Roboto({ subsets: ["latin"], weight: "100" });

export const metadata = {
  title: "...",
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
