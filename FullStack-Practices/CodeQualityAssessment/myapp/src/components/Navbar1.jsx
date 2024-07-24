import { useEffect, useState } from 'react';
import { useNavigate } from 'react-router-dom';
import {
  Menu,
  MenuButton,
  MenuItem,
  MenuItems,
  Transition,
} from '@headlessui/react';
import { BellIcon } from '@heroicons/react/24/outline';
import { Button } from 'antd';

function Navbar1() {

  const navigate = useNavigate();
  const [state, setState] = useState(false);

  const name = sessionStorage.getItem('UserName');

  useEffect(() => {
    if (name === null) {
      navigate('/');
    }
  }, []);

  const handleLogout = () => {
    sessionStorage.clear();
    navigate('/');
  };

  function classNames(...classes) {
    return classes.filter(Boolean).join(' ')
  }

  return (
    <>
      <nav
        className={`bg-white pb-5 md:text-sm ${
          state
            ? 'shadow-lg rounded-xl border mx-2 mt-2 md:shadow-none md:border-none md:mx-2 md:mt-0'
            : ''
        }`}
      >
        <div className="max-w-screen-xl mx-auto px-4 md:flex md:px-8">
          <div className="flex items-center justify-between py-5 md:block">
            <a href="javascript:void(0)">
              <img
                src="https://thumbs.dreamstime.com/b/donation-charity-logo-label-hand-holding-heart-icon-vector-symbol-isolated-white-background-97894491.jpg"
                width={120}
                height={50}
                alt="Float UI logo"
              />
            </a>
            <div className="md:hidden">
              <button
                className="menu-btn text-gray-500 hover:text-gray-800"
                onClick={() => setState(!state)}
              >
                {state ? (
                  <svg
                    xmlns="http://www.w3.org/2000/svg"
                    className="h-6 w-6"
                    viewBox="0 0 20 20"
                    fill="currentColor"
                  >
                    <path
                      fillRule="evenodd"
                      d="M4.293 4.293a1 1 0 011.414 0L10 8.586l4.293-4.293a1 1 0 111.414 1.414L11.414 10l4.293 4.293a1 1 0 01-1.414 1.414L10 11.414l-4.293 4.293a1 1 0 01-1.414-1.414L8.586 10 4.293 5.707a1 1 0 010-1.414z"
                      clipRule="evenodd"
                    />
                  </svg>
                ) : (
                  <svg
                    xmlns="http://www.w3.org/2000/svg"
                    fill="none"
                    viewBox="0 0 24 24"
                    strokeWidth={1.5}
                    stroke="currentColor"
                    className="w-6 h-6"
                  >
                    <path
                      strokeLinecap="round"
                      strokeLinejoin="round"
                      d="M3.75 6.75h16.5M3.75 12h16.5m-16.5 5.25h16.5"
                    />
                  </svg>
                )}
              </button>
            </div>
          </div>
          <div
            className={`flex-1 items-center mt-8 md:mt-0 md:flex  ${
              state ? 'block' : 'hidden'
            }`}
          >
            <ul className="md:flex md:space-x-6 flex-1 items-center p-6 font-medium">
              {/* Moved "Donate" and "Donator Details" to the right */}
              <li className="text-gray-1000 hover:text-gray-1000  ml-auto text-l font-bold">
                <a href="/adduser" className="block">
                <button>Donate</button>
                  
                </a>
              </li>
              <li className="text-gray-1000 hover:text-gray-1000  text-l font-bold">
                <a href="/viewuser" className="block">
                <button>Donator Details</button>
                  
                </a>
              </li>
            </ul>
            <div className="ml-auto flex items-center space-x-6">
              <button
                type="button"
                className="relative rounded-full bg-gray-800 p-1 text-gray-400 hover:text-white focus:outline-none focus:ring-2 focus:ring-white focus:ring-offset-2 focus:ring-offset-gray-800"
              >
                <span className="absolute -inset-1.5" />
                <span className="sr-only" >View notifications</span>
                <BellIcon className="h-6 w-6" aria-hidden="true" />
              </button>

              {/* Profile dropdown */}
              <Menu as="div" className="relative">
                <div>
                  <MenuButton className="relative flex rounded-full bg-gray-800 text-sm focus:outline-none focus:ring-2 focus:ring-white focus:ring-offset-2 focus:ring-offset-gray-800">
                    <span className="absolute -inset-1.5" />
                    <span className="sr-only">Open user menu</span>
                    <img
                      className="h-8 w-8 rounded-full"
                      src="https://images.pexels.com/photos/3613388/pexels-photo-3613388.jpeg?auto=compress&cs=tinysrgb&w=600"
                      alt=""
                    />
                  </MenuButton>
                </div>
                <Transition
                  enter="transition ease-out duration-100"
                  enterFrom="transform opacity-0 scale-95"
                  enterTo="transform opacity-100 scale-100"
                  leave="transition ease-in duration-75"
                  leaveFrom="transform opacity-100 scale-100"
                  leaveTo="transform opacity-0 scale-95"
                >
                  <MenuItems className="absolute right-0 z-10 mt-2 w-48 origin-top-right rounded-md bg-white py-1 shadow-lg ring-1 ring-black ring-opacity-5 focus:outline-none">
                    <MenuItem>
                      {({ focus }) => (
                        <a
                          href="#"
                          className={classNames(
                            focus ? 'bg-gray-100' : '',
                            'block px-4 py-2 text-sm text-gray-700'
                          )}
                        >
                          <button>Your Profile</button>
                         
                        </a>
                      )}
                    </MenuItem>
                    <MenuItem>
                      {({ focus }) => (
                        <a
                          href="#"
                          className={classNames(
                            focus ? 'bg-gray-100' : '',
                            'block px-4 py-2 text-sm text-gray-700'
                          )}
                        >
                          <button>Settings</button>
                          
                        </a>
                      )}
                    </MenuItem>
                    <MenuItem>
                      {({ focus }) => (
                        <a
                          onClick={handleLogout}
                          className={classNames(
                            focus ? 'bg-gray-100' : '',
                            'block px-4 py-2 text-sm text-gray-700'
                          )}
                        ><button>Sign out</button>
                          
                        </a>
                      )}
                    </MenuItem>
                  </MenuItems>
                </Transition>
              </Menu>
            </div>
          </div>
        </div>
      </nav>
    </>
  );
}

export default Navbar1;
