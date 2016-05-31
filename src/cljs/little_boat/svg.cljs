(ns little-boat.svg)
;;this symbol holds the value of the svg file as a string
;;i have created one svg file in adobe illustrator
;;and i have processed through svgomg (https://jakearchibald.github.io/svgomg/)
(def html-str "<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"841.89\" height=\"595.28\" viewBox=\"0 0 841.89 595.28\"><path fill=\"#00AEEF\" d=\"M118.97 287.106c28.08-8.474 57.883-6.352 86.714-9.94 15.892-1.977 31.586-4.404 47.59-5.477 16.15-1.085 32.343-1.42 48.523-1.725 32.097-.602 64.025-1.958 96.018-4.68 31.775-2.706 63.496-6.042 95.315-8.233 22.864-1.575 45.78-2.477 68.702-2.15 11.37.163 22.732.71 34.067 1.612 11.15.887 22.257 3.035 33.402 3.68 3.223.185 3.205-4.816 0-5-7.37-.427-14.77-1.813-22.117-2.616-8.146-.892-16.32-1.5-24.502-1.958-15.817-.885-31.675-.95-47.51-.588-31.927.73-63.77 3.542-95.557 6.46-31.63 2.907-63.266 6.04-95.01 7.397-32.384 1.384-64.827.81-97.17 3.21-22.63 1.677-44.893 5.907-67.562 7.234-20.87 1.223-42.08 1.864-62.237 7.947-3.076.93-1.763 5.76 1.33 4.825z\"/><path fill=\"#00AEEF\" d=\"M113.146 286.957c6.693 9.933 14.36 19.22 22.1 28.345 8.367 9.864 16.862 19.802 26.843 28.082 19.65 16.303 43.996 25.66 68.406 32.18 26.6 7.103 53.828 11.808 81.385 12.266 29.497.49 58.966-2.968 88.096-7.273 48.247-7.132 96.953-17.196 140.27-40.54 10.984-5.92 21.337-12.89 31.228-20.48 9.467-7.266 17.988-15.576 27.24-23.072 7.768-6.293 15.738-12.316 23.21-18.967 6.814-6.065 13.905-13.01 17.538-21.54 1.25-2.93-3.057-5.48-4.316-2.522-4.438 10.414-13.936 18.282-22.396 25.4-9.202 7.746-18.726 14.987-27.71 22.993-22.68 20.205-47.984 36.07-76.227 47.265-26.753 10.604-54.958 17.362-83.247 22.35-29.268 5.16-58.882 9.278-88.572 10.873-43.647 2.344-88.15-3.983-129.248-19.13-19.6-7.224-37.884-17.884-52.5-32.927-13.662-14.06-26.823-29.56-37.783-45.825-1.79-2.662-6.125-.162-4.317 2.52z\"/><path fill=\"#00AEEF\" d=\"M357.715 267.36c5.747-36.492 18.966-71.758 15.946-109.215-1.55-19.22-5.587-38.25-7.9-57.387-2.425-20.094-2.95-40.324-.043-60.398.457-3.152-4.36-4.51-4.82-1.33-5.486 37.87 1.914 74.88 7 112.33 5.338 39.323-8.972 76.385-15 114.67-.5 3.154 4.32 4.508 4.82 1.33z\"/><path fill=\"#00AEEF\" d=\"M353.805 76.695c-.915 8.814-1.45 17.75-4.49 26.15-3.72 10.268-12.113 17.857-20.52 24.348-18.126 13.99-38.948 23.187-59.752 32.343-23.584 10.38-48.463 17.28-72.565 26.292-10.956 4.095-21.647 8.504-32.037 13.892-11.143 5.78-22.02 12.118-33.8 16.565-2.034.77-2.704 4.41 0 4.82 39.96 6.067 80.07 2.95 120.028-1.4 19.553-2.13 38.683-5.43 57.94-9.413 19.356-4.003 38.855-7.97 58.698-8.096 3.223-.02 3.225-5.02 0-5-18.405.116-36.556 3.493-54.534 7.146-19.367 3.935-38.556 7.763-58.217 9.937-40.724 4.5-81.823 8.192-122.583 2.005v4.82c11.07-4.18 21.422-9.878 31.853-15.416 11.58-6.147 23.49-11.118 35.76-15.705 25-9.346 50.454-16.98 75.053-27.42 22.207-9.425 43.863-20.275 62.548-35.728 7.426-6.14 13.41-13.667 16.952-22.664 3.397-8.627 3.724-18.363 4.67-27.48.332-3.205-4.672-3.173-5 0z\"/><path fill=\"#00AEEF\" d=\"M361.305 81.195c9.895 1.096 18.263 8.455 25.84 14.308 8.126 6.276 16.873 11.8 25.6 17.195 19.6 12.117 40.693 22.72 62.81 29.383 20.786 6.265 43.725 7.44 65.306 8.223 15.764.573 37.426-2.797 45.288 14.656 1.322 2.935 5.63.39 4.316-2.524-7.24-16.078-24.994-16.907-40.43-17.014-23.033-.16-47.252-1.436-69.62-7.177-23.627-6.064-46.053-18.06-66.68-30.81-9.1-5.627-17.99-11.56-26.46-18.095-7.758-5.988-15.957-12.033-25.97-13.142-3.2-.356-3.166 4.648.002 5z\"/><path fill=\"#00AEEF\" d=\"M366.97 205.106c37.236-10.148 76.23-11.292 113.438-21.566 18.287-5.05 35.03-14.033 53.123-19.627 16.835-5.205 34.233-6.67 51.775-6.717 3.224-.008 3.225-5.008 0-5-17.01.044-33.81 1.468-50.24 6.053-18.072 5.04-34.63 14.06-52.572 19.482-38.102 11.51-78.49 12.097-116.852 22.552-3.106.846-1.785 5.67 1.33 4.82zm-5.33-168c16.63 3.336 31.64 11.732 48 16l.665-4.91c-17.273 1.362-33.694 9.68-51 10-3.22.06-3.226 5.06 0 5 17.37-.32 33.716-8.637 51-10 2.712-.215 3.527-4.165.665-4.912-16.36-4.268-31.37-12.664-48-16-3.15-.63-4.49 4.188-1.33 4.822zm-181.597 255.43c-23.414 13.816 7.2 48.37 27.865 40.71 13.417-4.973 20.78-25.933 14.435-38.367-7.52-14.734-28.236-8.117-37.806.046-2.457 2.096 1.097 5.615 3.535 3.535 7.916-6.75 24.237-12.26 30.353-.28 3.22 6.31.25 15.03-2.666 20.83-2.38 4.73-6.118 8.7-11.33 10.098-14.615 3.913-39.16-22.05-21.864-32.256 2.773-1.637.26-5.96-2.524-4.317zm125.262 6.66c-13.324-.638-20.15 9.89-17.884 22.3 2.366 12.943 13.94 22.336 27.105 20.287 16.01-2.493 28.732-18.77 19.907-33.96-6.388-10.996-24.015-19.18-33.893-7.896-2.115 2.415 1.407 5.966 3.534 3.535 7.843-8.958 20.95-1.165 26.042 6.884 7.97 12.603-4.946 24.25-16.92 26.614-20.47 4.045-31.206-33.88-7.89-32.766 3.225.156 3.21-4.845 0-5zm96.335 4.088c-11.068 1.82-12.345 11.9-7.645 20.557 5.502 10.137 18.004 18.04 29.728 16.26 13.45-2.04 22.57-17.373 17.514-30.14-7.264-18.335-28.343-8.193-41.932-6.764-3.173.334-3.205 5.337 0 5 11.325-1.19 25.696-9.383 35.232.268 8.932 9.04-.78 24.537-11.083 26.656-9.096 1.87-18.52-4.44-23.645-11.45-4.373-5.975-5.93-14.07 3.16-15.563 3.174-.523 1.822-5.34-1.33-4.823zm118.33-16c-7.918-3.005-12.51 4.86-10.95 11.827 2.556 11.43 16.636 11.347 25.316 8.18 9.56-3.49 17.945-13.076 11.752-23.23-6.356-10.423-20.432-8.545-29.045-2.52-2.62 1.83-.126 6.17 2.523 4.315 6.218-4.348 14.84-6.67 20.94-.817 6.12 5.87.935 13.07-4.982 16.288-6.14 3.34-17.27 5.516-21.2-2.107-1.84-3.57-.33-8.876 4.315-7.113 3.02 1.146 4.312-3.69 1.33-4.82z\"/><path fill=\"#1C75BC\" d=\"M32.97 402.106c9.923-2.846 18.366-10.698 27.092-15.933 11.907-7.142 26.596-10.492 40.024-13.455 14.508-3.2 29.223-4.56 43.855-6.933 16.71-2.71 33.73-3.258 50.625-2.913 32.77.67 65.613 4.76 98.198 8.083 31.9 3.253 63.808 6.618 95.44 11.955 31.018 5.233 61.258 14.008 92.282 19.206 30.597 5.126 61.84 7.22 92.715 3.457 30.735-3.746 60.545-14.68 89.1-26.253 13.488-5.467 26.77-11.438 39.944-17.618 11.486-5.388 22.753-11.252 34.872-15.136 7.2-2.308 14.992-3.87 22.523-2.46 3.15.59 4.494-4.23 1.33-4.823-22.48-4.207-45.247 10.813-64.79 19.742-28.898 13.2-58.124 25.28-88.648 34.23-30.8 9.03-62.616 10.71-94.488 8.03-31.897-2.684-62.607-10.552-93.746-17.44-30.547-6.757-61.636-10.845-92.702-14.323-32.12-3.596-64.327-6.767-96.527-9.567-16.4-1.427-32.847-2.348-49.315-2.145-16.19.2-32.024 2.395-48.045 4.452-26.33 3.383-55.823 7.325-78.694 21.763-7.077 4.468-14.213 10.918-22.377 13.258-3.095.89-1.778 5.713 1.33 4.823z\"/><path fill=\"#1C75BC\" d=\"M60.463 466.957c6.946-9.51 19.493-13.28 30.222-16.635 12.773-3.993 25.45-8.245 38.378-11.73 30.99-8.36 62.748-13.184 94.668-16.17 32.205-3.014 64.92-5.014 97.276-4.133 15.872.43 31.585 3.133 47.25 5.502 15.07 2.278 30.105 3.426 45.29 4.578 62.812 4.768 125.822 14.977 188.903 8.3 53.194-5.63 104.415-21.587 148.73-52.053 3.18-2.186 6.296-4.458 9.387-6.764 2.553-1.903.064-6.247-2.523-4.316-44.31 33.044-95.902 50.954-150.496 57.555-62.76 7.588-125.756-2.125-188.29-7.27-16.013-1.315-31.94-2.23-47.853-4.58-14.885-2.196-29.718-4.7-44.75-5.687-16.002-1.052-32.248-.25-48.26.33-16.298.59-32.58 1.625-48.83 3.014-31.228 2.67-62.25 7.092-92.723 14.53-13.935 3.4-27.47 7.88-41.154 12.126-10.493 3.258-21.305 6.22-30.595 12.294-3.514 2.3-6.476 5.202-8.945 8.583-1.904 2.61 2.437 5.1 4.318 2.524z\"/><path fill=\"#1C75BC\" d=\"M81.566 513.854c13.26-6.69 25.954-14.437 39.3-20.962 14.21-6.947 29.535-11.61 44.73-15.876 31.055-8.72 62.858-14 94.874-17.64 32.04-3.645 64.265-5.478 96.487-6.49 32.752-1.03 65.43-1.233 98.166.4 53.163 2.655 106.135 7.932 159.32 10.3 23.348 1.04 46.756 2.732 69.98-.828 10.872-1.666 21.608-4.698 31.246-10.06 10.566-5.876 19.937-13.624 30.895-18.845 2.91-1.386.37-5.696-2.523-4.316-13.258 6.315-24.31 16.96-37.98 22.372-13.617 5.39-28.374 7.252-42.91 7.875-14.518.622-29.07-.25-43.57-.958-15.6-.763-31.198-1.327-46.79-2.31-32.71-2.06-65.355-5.01-98.063-7.104-32.76-2.1-65.424-2.71-98.24-2.033-52.578 1.086-105.154 4.255-157.12 12.612-25.304 4.07-50.46 10.178-74.8 18.202-23.357 7.702-43.71 20.332-65.526 31.343-2.88 1.452-.35 5.766 2.52 4.317z\"/><path fill=\"#FFF200\" d=\"M104.043 70.537c-25.743 15.402-2.593 46.54 16.298 55.77 10.22 4.993 22.836 5.682 30.938-3.457 11.738-13.24 8.497-33.54.05-47.468-4.46-7.35-11.875-14.25-20.803-15.054-11.818-1.066-20.343 7.908-27.986 15.6-2.275 2.29 1.26 5.825 3.534 3.535 8.165-8.216 18.042-18.5 30.41-12.104 9.314 4.814 14.473 16.144 16.677 25.857 2.99 13.17-2.706 32.108-18.735 31.835-19.497-.332-52.92-34.213-28.57-49.773l.713-.427c2.763-1.653.25-5.977-2.524-4.317z\"/><path fill=\"#FFF200\" d=\"M78.537 40.463c10.09 11.904 22.442 21.548 33 33 2.19 2.375 5.717-1.17 3.535-3.535-10.558-11.452-22.91-21.096-33-33-2.087-2.464-5.606 1.092-3.535 3.535zm73.433 36.643c10.99-4.287 19.032-13.2 29.596-18.252 2.908-1.39.37-5.7-2.523-4.317-10.144 4.85-17.88 13.644-28.403 17.748-2.97 1.158-1.68 5.994 1.33 4.82zm4.67 28c11.146 3.29 20.448 10.795 32 13 3.15.602 4.494-4.217 1.33-4.82-11.52-2.2-20.86-9.714-32-13-3.1-.916-4.415 3.91-1.33 4.82zm-17.746 23.254c3.03 10.334 5.103 20.932 9 31 1.15 2.974 5.987 1.682 4.82-1.33-3.896-10.067-5.97-20.665-9-31-.904-3.087-5.73-1.772-4.82 1.33zm-33.357-8.432c-5.506 4.52-10.116 10.176-13.39 16.506-1.48 2.86 2.834 5.388 4.316 2.523 3.102-5.995 7.396-11.214 12.61-15.494 2.493-2.047-1.066-5.564-3.536-3.535zM86.305 94.195c-12.23 1.18-23.818 5.066-35.665 8.09-3.123.796-1.797 5.618 1.33 4.82 11.386-2.905 22.578-6.775 34.334-7.91 3.18-.307 3.21-5.31 0-5z\"/><path fill=\"#009444\" d=\"M548.305 98.195c25.63-.75 48.043 12.174 66.232 29.268.937.88 2.624 1.055 3.535 0 12.02-13.918 28.033-30.715 47.232-33.268 3.148-.418 3.188-5.424 0-5-20.763 2.76-37.692 19.592-50.768 34.732h3.535c-19.123-17.973-42.83-31.52-69.766-30.732-3.215.095-3.225 5.095.002 5zm118.665 60.91c19.462-6.836 41.867-3.14 60.073 5.75 1.252.61 2.66.323 3.42-.898 9.154-14.678 27.855-25.162 45.177-19.85 3.092.947 4.403-3.88 1.33-4.822-19.484-5.974-40.513 5.615-50.823 22.15 1.14-.3 2.28-.6 3.42-.898-19.355-9.452-43.194-13.535-63.927-6.252-3.02 1.06-1.72 5.893 1.33 4.82zm-47.33 46c14.5 4.044 30.76 5.654 42.897 15.358 1.447 1.157 3.598.84 4.18-1.103 4.457-14.937 23.47-22.042 37.588-23.165 3.19-.254 3.217-5.256 0-5-16.44 1.307-37.254 9.558-42.41 26.835l4.178-1.103c-12.982-10.38-29.576-12.313-45.103-16.643-3.113-.867-4.43 3.957-1.33 4.822z\"/></svg>
")
