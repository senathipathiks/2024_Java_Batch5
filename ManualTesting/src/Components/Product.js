import React from 'react'

function Product() {
  return (
    <div>
      <div class="font-sans py-4 mx-auto lg:max-w-9xl md:max-w-8xl max-sm:max-w-md bg-gray-800 ">
      <h2 class="text-4xl font-extrabold text-gray-800 text-center mb-12">Top Products</h2>
      <div class="grid grid-cols-1 sm:grid-cols-2 md:grid-cols-3 lg:grid-cols-4 sm:gap-6 gap-12">

        <div class="bg-gray-100 p-3 rounded-lg group overflow-hidden cursor-pointer relative z-50 hover:before:bg-black before:absolute before:inset-0 before:opacity-20 before:transition-all">
          <div class="w-full h-[300px] overflow-hidden mx-auto aspect-w-16 aspect-h-8">
            <img src="https://readymadeui.com/images/sunglass7.webp" alt="product1"
              class="h-full w-full object-contain" />
          </div>

          <div class="absolute mx-auto left-0 right-0 -bottom-80 group-hover:bottom-2 bg-white w-11/12 p-3 rounded-lg transition-all duration-300">
            <div class="text-center">
              <h3 class="text-base font-bold text-gray-800">White Sun Glass</h3>
              <h4 class="text-lg text-blue-600 font-bold mt-2">$35.00</h4>
            </div>

            <div class="flex justify-center space-x-1 mt-4">
              <svg class="w-4 fill-[#facc15]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
              <svg class="w-4 fill-[#facc15]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
              <svg class="w-4 fill-[#facc15]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
              <svg class="w-4 fill-[#facc15]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
              <svg class="w-4 fill-[#CED5D8]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
            </div>
          </div>
        </div>

        <div class="bg-gray-100 p-3 rounded-lg group overflow-hidden cursor-pointer relative z-50 hover:before:bg-black before:absolute before:inset-0 before:opacity-20 before:transition-all">
          <div class="w-full h-[300px] overflow-hidden mx-auto aspect-w-16 aspect-h-8">
            <img src="https://readymadeui.com/images/product14.webp" alt="product2"
              class="h-full w-full object-contain" />
          </div>

          <div class="absolute mx-auto left-0 right-0 -bottom-80 group-hover:bottom-2 bg-white w-11/12 p-3 rounded-lg transition-all duration-300">
            <div class="text-center">
              <h3 class="text-base font-bold text-gray-800">Echo Elegance</h3>
              <h4 class="text-lg text-blue-600 font-bold mt-2">$20.00</h4>
            </div>

            <div class="flex justify-center space-x-1 mt-4">
              <svg class="w-4 fill-[#facc15]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
              <svg class="w-4 fill-[#facc15]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
              <svg class="w-4 fill-[#facc15]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
              <svg class="w-4 fill-[#facc15]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
              <svg class="w-4 fill-[#CED5D8]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
            </div>
          </div>
        </div>

        <div class="bg-gray-100 p-3 rounded-lg group overflow-hidden cursor-pointer relative z-50 hover:before:bg-black before:absolute before:inset-0 before:opacity-20 before:transition-all">
          <div class="w-full h-[300px] overflow-hidden mx-auto aspect-w-16 aspect-h-8">
            <img src="https://readymadeui.com/images/laptop4.webp" alt="product3"
              class="h-full w-full object-contain" />
          </div>

          <div class="absolute mx-auto left-0 right-0 -bottom-80 group-hover:bottom-2 bg-white w-11/12 p-3 rounded-lg transition-all duration-300">
            <div class="text-center">
              <h3 class="text-base font-bold text-gray-800">Acer One 14 AMD</h3>
              <h4 class="text-lg text-blue-600 font-bold mt-2">$400.00</h4>
            </div>

            <div class="flex justify-center space-x-1 mt-4">
              <svg class="w-4 fill-[#facc15]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
              <svg class="w-4 fill-[#facc15]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
              <svg class="w-4 fill-[#facc15]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
              <svg class="w-4 fill-[#facc15]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
              <svg class="w-4 fill-[#CED5D8]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
            </div>
          </div>
        </div>

        <div class="bg-gray-100 p-3 rounded-lg group overflow-hidden cursor-pointer relative z-50 hover:before:bg-black before:absolute before:inset-0 before:opacity-20 before:transition-all">
          <div class="w-full h-[300px] overflow-hidden mx-auto aspect-w-16 aspect-h-8">
            <img src="https://readymadeui.com/images/coffee2.webp" alt="product4"
              class="h-full w-full object-contain" />
          </div>

          <div class="absolute mx-auto left-0 right-0 -bottom-80 group-hover:bottom-2 bg-white w-11/12 p-3 rounded-lg transition-all duration-300">
            <div class="text-center">
              <h3 class="text-base font-bold text-gray-800">Irish Cream Dream</h3>
              <h4 class="text-lg text-blue-600 font-bold mt-2">$11.00</h4>
            </div>

            <div class="flex justify-center space-x-1 mt-4">
              <svg class="w-4 fill-[#facc15]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
              <svg class="w-4 fill-[#facc15]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
              <svg class="w-4 fill-[#facc15]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
              <svg class="w-4 fill-[#facc15]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
              <svg class="w-4 fill-[#CED5D8]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
            </div>
          </div>
        </div>

        <div class="bg-gray-100 p-3 rounded-lg group overflow-hidden cursor-pointer relative z-50 hover:before:bg-black before:absolute before:inset-0 before:opacity-20 before:transition-all">
          <div class="w-full h-[300px] overflow-hidden mx-auto aspect-w-16 aspect-h-8">
            <img src="https://readymadeui.com/images/coffee7.webp" alt="product5"
              class="h-full w-full object-contain" />
          </div>

          <div class="absolute mx-auto left-0 right-0 -bottom-80 group-hover:bottom-2 bg-white w-11/12 p-3 rounded-lg transition-all duration-300">
            <div class="text-center">
              <h3 class="text-base font-bold text-gray-800">Mocha Madness</h3>
              <h4 class="text-lg text-blue-600 font-bold mt-2">$10.00</h4>
            </div>

            <div class="flex justify-center space-x-1 mt-4">
              <svg class="w-4 fill-[#facc15]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
              <svg class="w-4 fill-[#facc15]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
              <svg class="w-4 fill-[#facc15]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
              <svg class="w-4 fill-[#facc15]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
              <svg class="w-4 fill-[#CED5D8]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
            </div>
          </div>
        </div>

        <div class="bg-gray-100 p-3 rounded-lg group overflow-hidden cursor-pointer relative z-50 hover:before:bg-black before:absolute before:inset-0 before:opacity-20 before:transition-all">
          <div class="w-full h-[300px] overflow-hidden mx-auto aspect-w-16 aspect-h-8">
            <img src="https://readymadeui.com/images/sunglass6.webp" alt="product6"
              class="h-full w-full object-contain" />
          </div>

          <div class="absolute mx-auto left-0 right-0 -bottom-80 group-hover:bottom-2 bg-white w-11/12 p-3 rounded-lg transition-all duration-300">
            <div class="text-center">
              <h3 class="text-base font-bold text-gray-800">Black Sun Glass</h3>
              <h4 class="text-lg text-blue-600 font-bold mt-2">$70.00</h4>
            </div>

            <div class="flex justify-center space-x-1 mt-4">
              <svg class="w-4 fill-[#facc15]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
              <svg class="w-4 fill-[#facc15]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
              <svg class="w-4 fill-[#facc15]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
              <svg class="w-4 fill-[#facc15]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
              <svg class="w-4 fill-[#CED5D8]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
            </div>
          </div>
        </div>

        <div class="bg-gray-100 p-3 rounded-lg group overflow-hidden cursor-pointer relative z-50 hover:before:bg-black before:absolute before:inset-0 before:opacity-20 before:transition-all">
          <div class="w-full h-[300px] overflow-hidden mx-auto aspect-w-16 aspect-h-8">
            <img src="https://readymadeui.com/images/product12.webp" alt="product7"
              class="h-full w-full object-contain" />
          </div>

          <div class="absolute mx-auto left-0 right-0 -bottom-80 group-hover:bottom-2 bg-white w-11/12 p-3 rounded-lg transition-all duration-300">
            <div class="text-center">
              <h3 class="text-base font-bold text-gray-800">Urban Sneakers</h3>
              <h4 class="text-lg text-blue-600 font-bold mt-2">$20.00</h4>
            </div>

            <div class="flex justify-center space-x-1 mt-4">
              <svg class="w-4 fill-[#facc15]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
              <svg class="w-4 fill-[#facc15]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
              <svg class="w-4 fill-[#facc15]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
              <svg class="w-4 fill-[#facc15]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
              <svg class="w-4 fill-[#CED5D8]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
            </div>
          </div>
        </div>

        <div class="bg-gray-100 p-3 rounded-lg group overflow-hidden cursor-pointer relative z-50 hover:before:bg-black before:absolute before:inset-0 before:opacity-20 before:transition-all">
          <div class="w-full h-[300px] overflow-hidden mx-auto aspect-w-16 aspect-h-8">
            <img src="https://readymadeui.com/images/laptop2.webp" alt="product8"
              class="h-full w-full object-contain" />
          </div>

          <div class="absolute mx-auto left-0 right-0 -bottom-80 group-hover:bottom-2 bg-white w-11/12 p-3 rounded-lg transition-all duration-300">
            <div class="text-center">
              <h3 class="text-base font-bold text-gray-800">ASUS Vivobook 15</h3>
              <h4 class="text-lg text-blue-600 font-bold mt-2">$450.00</h4>
            </div>

            <div class="flex justify-center space-x-1 mt-4">
              <svg class="w-4 fill-[#facc15]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
              <svg class="w-4 fill-[#facc15]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
              <svg class="w-4 fill-[#facc15]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
              <svg class="w-4 fill-[#facc15]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
              <svg class="w-4 fill-[#CED5D8]" viewBox="0 0 14 13" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M7 0L9.4687 3.60213L13.6574 4.83688L10.9944 8.29787L11.1145 12.6631L7 11.2L2.8855 12.6631L3.00556 8.29787L0.342604 4.83688L4.5313 3.60213L7 0Z" />
              </svg>
            </div>
          </div>
        </div>

      </div>
    </div>
    <div class="font-[sans-serif] p-2 mx-auto lg:max-w-9xl md:max-w-8xl max-sm:max-w-md bg-gray-800">
      <h2 class="text-4xl font-extrabold text-gray-800 mb-12">Glasses</h2>
      <div class="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-6">

        <div
          class="bg-white border overflow-hidden rounded-2xl cursor-pointer hover:border-blue-600 transition-all relative">
          <div class="bg-gray-50 p-4 h-[250px] overflow-hidden mx-auto aspect-w-16 aspect-h-8 rounded-b-2xl">
            <img src="https://readymadeui.com/images/sunglass1.webp" alt="sunglass1"
              class="h-full w-full object-contain" />
          </div>

          <div class="p-6">
            <h3 class="text-lg font-bold text-gray-800">Golden Glass Wear</h3>
            <div class="flex items-center justify-between mt-6">
              <div
                class="w-10 h-10  bg-gray-100 flex items-center justify-center rounded-full">
                <svg xmlns="http://www.w3.org/2000/svg" width="18px" class="fill-gray-800 inline-block" viewBox="0 0 64 64">
                  <path
                    d="M45.5 4A18.53 18.53 0 0 0 32 9.86 18.5 18.5 0 0 0 0 22.5C0 40.92 29.71 59 31 59.71a2 2 0 0 0 2.06 0C34.29 59 64 40.92 64 22.5A18.52 18.52 0 0 0 45.5 4ZM32 55.64C26.83 52.34 4 36.92 4 22.5a14.5 14.5 0 0 1 26.36-8.33 2 2 0 0 0 3.27 0A14.5 14.5 0 0 1 60 22.5c0 14.41-22.83 29.83-28 33.14Z"
                    data-original="#000000"></path>
                </svg>
              </div>
              <h4 class="text-lg text-gray-800 font-bold">$10.5</h4>
            </div>
          </div>
        </div>

        <div
          class="bg-white border overflow-hidden rounded-2xl cursor-pointer hover:border-blue-600 transition-all relative">
          <div class="bg-gray-50 p-4 h-[250px] overflow-hidden mx-auto aspect-w-16 aspect-h-8 rounded-b-2xl">
            <img src="https://readymadeui.com/images/sunglass2.webp" alt="sunglass2"
              class="h-full w-full object-contain" />
          </div>

          <div class="p-6">
            <h3 class="text-lg font-bold text-gray-800">Blue Glass Wear</h3>
            <div class="flex items-center justify-between mt-6">
              <div
                class="w-10 h-10  bg-gray-100 flex items-center justify-center rounded-full">
                <svg xmlns="http://www.w3.org/2000/svg" width="18px" class="fill-gray-800 inline-block" viewBox="0 0 64 64">
                  <path
                    d="M45.5 4A18.53 18.53 0 0 0 32 9.86 18.5 18.5 0 0 0 0 22.5C0 40.92 29.71 59 31 59.71a2 2 0 0 0 2.06 0C34.29 59 64 40.92 64 22.5A18.52 18.52 0 0 0 45.5 4ZM32 55.64C26.83 52.34 4 36.92 4 22.5a14.5 14.5 0 0 1 26.36-8.33 2 2 0 0 0 3.27 0A14.5 14.5 0 0 1 60 22.5c0 14.41-22.83 29.83-28 33.14Z"
                    data-original="#000000"></path>
                </svg>
              </div>
              <h4 class="text-lg text-gray-800 font-bold">$9</h4>
            </div>
          </div>
        </div>

        <div
          class="bg-white border overflow-hidden rounded-2xl cursor-pointer hover:border-blue-600 transition-all relative">
          <div class="bg-gray-50 p-4 h-[250px] overflow-hidden mx-auto aspect-w-16 aspect-h-8 rounded-b-2xl">
            <img src="https://readymadeui.com/images/sunglass5.webp" alt="sunglass3"
              class="h-full w-full object-contain" />
          </div>

          <div class="p-6">
            <h3 class="text-lg font-bold text-gray-800">Black Glass Wear</h3>
            <div class="flex items-center justify-between mt-6">
              <div
                class="w-10 h-10  bg-gray-100 flex items-center justify-center rounded-full">
                <svg xmlns="http://www.w3.org/2000/svg" width="18px" class="fill-gray-800 inline-block" viewBox="0 0 64 64">
                  <path
                    d="M45.5 4A18.53 18.53 0 0 0 32 9.86 18.5 18.5 0 0 0 0 22.5C0 40.92 29.71 59 31 59.71a2 2 0 0 0 2.06 0C34.29 59 64 40.92 64 22.5A18.52 18.52 0 0 0 45.5 4ZM32 55.64C26.83 52.34 4 36.92 4 22.5a14.5 14.5 0 0 1 26.36-8.33 2 2 0 0 0 3.27 0A14.5 14.5 0 0 1 60 22.5c0 14.41-22.83 29.83-28 33.14Z"
                    data-original="#000000"></path>
                </svg>
              </div>
              <h4 class="text-lg text-gray-800 font-bold">$16</h4>
            </div>
          </div>
        </div>

        <div
          class="bg-white border overflow-hidden rounded-2xl cursor-pointer hover:border-blue-600 transition-all relative">
          <div class="bg-gray-50 p-4 h-[250px] overflow-hidden mx-auto aspect-w-16 aspect-h-8 rounded-b-2xl">
            <img src="https://readymadeui.com/images/sunglass3.webp" alt="sunglass4"
              class="h-full w-full object-contain" />
          </div>

          <div class="p-6">
            <h3 class="text-lg font-bold text-gray-800">Round Glass</h3>
            <div class="flex items-center justify-between mt-6">
              <div
                class="w-10 h-10  bg-gray-100 flex items-center justify-center rounded-full">
                <svg xmlns="http://www.w3.org/2000/svg" width="18px" class="fill-gray-800 inline-block" viewBox="0 0 64 64">
                  <path
                    d="M45.5 4A18.53 18.53 0 0 0 32 9.86 18.5 18.5 0 0 0 0 22.5C0 40.92 29.71 59 31 59.71a2 2 0 0 0 2.06 0C34.29 59 64 40.92 64 22.5A18.52 18.52 0 0 0 45.5 4ZM32 55.64C26.83 52.34 4 36.92 4 22.5a14.5 14.5 0 0 1 26.36-8.33 2 2 0 0 0 3.27 0A14.5 14.5 0 0 1 60 22.5c0 14.41-22.83 29.83-28 33.14Z"
                    data-original="#000000"></path>
                </svg>
              </div>
              <h4 class="text-lg text-gray-800 font-bold">$14</h4>
            </div>
          </div>
        </div>

        <div
          class="bg-white border overflow-hidden rounded-2xl cursor-pointer hover:border-blue-600 transition-all relative">
          <div class="bg-gray-50 p-4 h-[250px] overflow-hidden mx-auto aspect-w-16 aspect-h-8 rounded-b-2xl">
            <img src="https://readymadeui.com/images/sunglass7.webp" alt="sunglass5"
              class="h-full w-full object-contain" />
          </div>

          <div class="p-6">
            <h3 class="text-lg font-bold text-gray-800">White Lens Glass</h3>
            <div class="flex items-center justify-between mt-6">
              <div
                class="w-10 h-10  bg-gray-100 flex items-center justify-center rounded-full">
                <svg xmlns="http://www.w3.org/2000/svg" width="18px" class="fill-gray-800 inline-block" viewBox="0 0 64 64">
                  <path
                    d="M45.5 4A18.53 18.53 0 0 0 32 9.86 18.5 18.5 0 0 0 0 22.5C0 40.92 29.71 59 31 59.71a2 2 0 0 0 2.06 0C34.29 59 64 40.92 64 22.5A18.52 18.52 0 0 0 45.5 4ZM32 55.64C26.83 52.34 4 36.92 4 22.5a14.5 14.5 0 0 1 26.36-8.33 2 2 0 0 0 3.27 0A14.5 14.5 0 0 1 60 22.5c0 14.41-22.83 29.83-28 33.14Z"
                    data-original="#000000"></path>
                </svg>
              </div>
              <h4 class="text-lg text-gray-800 font-bold">$8</h4>
            </div>
          </div>
        </div>

        <div
          class="bg-white border overflow-hidden rounded-2xl cursor-pointer hover:border-blue-600 transition-all relative">
          <div class="bg-gray-50 p-4 h-[250px] overflow-hidden mx-auto aspect-w-16 aspect-h-8 rounded-b-2xl">
            <img src="https://readymadeui.com/images/sunglass6.webp" alt="sunglass6"
              class="h-full w-full object-contain" />
          </div>

          <div class="p-6">
            <h3 class="text-lg font-bold text-gray-800">Black Glass</h3>
            <div class="flex items-center justify-between mt-6">
              <div
                class="w-10 h-10  bg-gray-100 flex items-center justify-center rounded-full">
                <svg xmlns="http://www.w3.org/2000/svg" width="18px" class="fill-gray-800 inline-block" viewBox="0 0 64 64">
                  <path
                    d="M45.5 4A18.53 18.53 0 0 0 32 9.86 18.5 18.5 0 0 0 0 22.5C0 40.92 29.71 59 31 59.71a2 2 0 0 0 2.06 0C34.29 59 64 40.92 64 22.5A18.52 18.52 0 0 0 45.5 4ZM32 55.64C26.83 52.34 4 36.92 4 22.5a14.5 14.5 0 0 1 26.36-8.33 2 2 0 0 0 3.27 0A14.5 14.5 0 0 1 60 22.5c0 14.41-22.83 29.83-28 33.14Z"
                    data-original="#000000"></path>
                </svg>
              </div>
              <h4 class="text-lg text-gray-800 font-bold">$11.5</h4>
            </div>
          </div>
        </div>
      </div>
    </div>
    </div>
  )
}

export default Product
