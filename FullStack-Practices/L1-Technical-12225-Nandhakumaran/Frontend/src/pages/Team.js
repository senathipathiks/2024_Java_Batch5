import Footer from "../components/Footer"
import Navbar from "../components/Navbar"
import { Link } from "react-router-dom";
import "./App2.css";

const people = [
    {
      name: 'Cappuccino',
      role: '$100',
      imageUrl:
        'https://images.pexels.com/photos/302899/pexels-photo-302899.jpeg?auto=compress&cs=tinysrgb&w=600',
    },
    {
        name: 'Latte',
        role: '$90',
        imageUrl:
          'https://images.pexels.com/photos/3879802/pexels-photo-3879802.jpeg?auto=compress&cs=tinysrgb&w=600',
      },
      {
        name: 'Macho',
        role: '$80',
        imageUrl:
          'https://images.pexels.com/photos/20854092/pexels-photo-20854092/free-photo-of-close-up-of-a-glass-of-coffee-with-milk-foam-and-cinnamon-on-top.jpeg?auto=compress&cs=tinysrgb&w=600',
      },
     
  ]
  
  
  
  export default function Team() {
    return (
      <><Navbar/>
      <div className="bg-white py-24 sm:py-32"> <div id="back"><Link to="/create" className="btn btn-primary">
          Go to Order
        </Link></div><br/>
        <div className="mx-auto grid max-w-7xl gap-x-8 gap-y-20 px-6 lg:px-8 xl:grid-cols-3">
       
          <div className="max-w-2xl">
            <h2 className="text-3xl font-bold tracking-tight text-gray-900 sm:text-4xl">Meet our Wonderful Menu</h2>
            <p className="mt-6 text-lg leading-8 text-gray-600">
              Libero fames augue nisl porttitor nisi, quis. Id ac elit odio vitae elementum enim vitae ullamcorper
              suspendisse.
            </p>
          </div>
          <ul role="list" className="grid gap-x-8 gap-y-12 sm:grid-cols-2 sm:gap-y-16 xl:col-span-2">
            {people.map((person) => (
              <li key={person.name}>
                <div className="flex items-center gap-x-6">
                  <img className="h-16 w-16 rounded-full" src={person.imageUrl} alt="" />
                  <div>
                    <h3 className="text-base font-semibold leading-7 tracking-tight text-gray-900">{person.name}</h3>
                    <p className="text-sm font-semibold leading-6 text-indigo-600">{person.role}</p>
                  </div>
                </div>
              </li>
            ))}
          </ul>
        </div>
      </div><Footer/></>
    )
  }
  