package com.example.myapplication;

public class QuestionAnswer {
    public static String question[] ={
            "Where can you share photos and videos with a limited lifespan?",
            "Who is the CEO of Tesla?",
            "Which programming language is commonly used for web development?",
            "Where is the headquarters of Microsoft located?",
            "What is the largest planet in our solar system?",
            "Which country is known as the Land of the Rising Sun?",
            "Who painted the Mona Lisa?",
            "What is the capital of Australia?",
            "Which animal is known as the 'King of the Jungle'?",
            "Who wrote the play 'Romeo and Juliet'?",
    };
    public static String Questions[][] = {{
            "Which country won the FIFA World Cup in 2018?",
            "In which year did the Summer Olympics take place in Rio de Janeiro?",
            "Who holds the record for the most Grand Slam tennis titles in the men's singles category?",
            "Which team has won the most Super Bowl championships in the NFL?",
            "What is the term for a perfect score of 10 in gymnastics?",
            "In which sport would you perform a slam dunk?",
            "Who is often referred to as 'The Greatest' in the history of boxing?",
            "Which country hosted the 2016 Summer Paralympics?",
            "What is the official ball used in a game of basketball?",
            "Which athlete set a new world record in the men's 100 meters at the 2009 World Championships?"
    },{
            "Which planet is known as the 'Red Planet'?",
            "What is the largest moon in our solar system?",
            "Who was the first human to step onto the surface of the Moon?",
            "Which galaxy is the Milky Way's nearest neighbor?",
            "What is the name of the largest volcano in our solar system?",
            "Which spacecraft was the first to land on Mars?",
            "What is the phenomenon where light is bent due to gravitational forces?",
            "Which planet is known as the 'Morning Star' or 'Evening Star'?",
            "What is the name of the first artificial satellite launched into space?",
            "Who formulated the laws of planetary motion?"
    },{
            "Who directed the movie 'The Shawshank Redemption'?",
            "Which actor played the character of Tony Stark in the Marvel Cinematic Universe?",
            "In which year was the first 'Star Wars' movie released?",
            "Who won the Academy Award for Best Actress in a Leading Role for her performance in 'La La Land'?",
            "What is the highest-grossing animated movie of all time?",
            "Which film won the Academy Award for Best Picture in 2020?",
            "Who played the iconic character of Jack Dawson in 'Titanic'?",
            "Which movie features a character named Hannibal Lecter?",
            "In 'The Lord of the Rings' trilogy, who is the main antagonist?",
            "Who directed the movie 'Inception'?"
    }, {
            "What is the chemical symbol for gold?",
            "Who is known as the father of modern physics?",
            "Which element is the most abundant in the Earth's crust?",
            "What is the process by which plants make their own food using sunlight?",
            "Which gas is responsible for the green color of plants?",
            "In the periodic table, which group do noble gases belong to?",
            "What is the speed of light in a vacuum?",
            "Who developed the theory of relativity?",
            "What is the smallest unit of an element that retains its chemical properties?",
            "Which planet is known as the 'Red Planet'?"
    }};


    public static int type=0;
    public static String[] selected = { "", "", "", "", "", "", "", "", "", "" };

    public static String choices[][] = {
            {"Facebook", "Twitter", "Snapchat", "LinkedIn"},
            {"Elon Musk", "Mark Zuckerberg", "Jeff Bezos", "Tim Cook"},
            {"Python", "C++", "HTML", "Swift"},
            {"Seattle", "New York", "San Francisco", "Redmond"},
            {"Jupiter", "Saturn", "Neptune", "Mercury"},
            {"China", "South Korea", "Japan", "Vietnam"},
            {"Leonardo da Vinci", "Pablo Picasso", "Vincent van Gogh", "Michelangelo"},
            {"Sydney", "Melbourne", "Canberra", "Perth"},
            {"Lion", "Tiger", "Elephant", "Giraffe"},
            {"William Shakespeare", "Charles Dickens", "Jane Austen", "Leo Tolstoy" },
    };
    public static String Choices[][][] = {{
            {"France", "Brazil", "Germany", "Spain"},
            {"2012", "2014", "2016", "2018"},
            {"Roger Federer", "Rafael Nadal", "Novak Djokovic", "Andy Murray"},
            {"New England Patriots", "Dallas Cowboys", "Green Bay Packers", "Pittsburgh Steelers"},
            {"10.0", "9.5", "Perfect", "Flawless"},
            {"Basketball", "Soccer", "Swimming", "Volleyball"},
            {"Muhammad Ali", "Mike Tyson", "Sugar Ray Robinson", "Floyd Mayweather Jr."},
            {"Brazil", "United States", "China", "Russia"},
            {"Basketball", "Soccer", "Volleyball", "Tennis"},
            {"Usain Bolt", "Tyson Gay", "Asafa Powell", "Justin Gatlin"}
    }, {
            {"Mars", "Venus", "Jupiter", "Mercury"},
            {"Titan", "Ganymede", "Io", "Europa"},
            {"Neil Armstrong", "Buzz Aldrin", "Yuri Gagarin", "Michael Collins"},
            {"Andromeda", "Triangulum", "Orion", "Canis Major"},
            {"Mauna Kea", "Olympus Mons", "Mount Everest", "Mauna Loa"},
            {"Viking 1", "Curiosity", "Opportunity", "Mars Pathfinder"},
            {"Black Hole", "Redshift", "Gravitational Lensing", "Dark Matter"},
            {"Mars", "Venus", "Jupiter", "Mercury"},
            {"Sputnik 1", "Hubble Space Telescope", "International Space Station", "Voyager 1"},
            {"Nicolaus Copernicus", "Galileo Galilei", "Johannes Kepler", "Isaac Newton"}
    }, {
            {"Quentin Tarantino", "Christopher Nolan", "Frank Darabont", "Steven Spielberg"},
            {"Chris Hemsworth", "Chris Evans", "Robert Downey Jr.", "Chris Pratt"},
            {"1975", "1977", "1980", "1983"},
            {"Emma Watson", "Emma Stone", "Natalie Portman", "Emma Roberts"},
            {"Frozen II", "The Lion King", "Toy Story 4", "Shrek 2"},
            {"Parasite", "Joker", "1917", "Green Book"},
            {"Leonardo DiCaprio", "Brad Pitt", "Tom Hanks", "Johnny Depp"},
            {"The Silence of the Lambs", "Se7en", "American Psycho", "Psycho"},
            {"Sauron", "Gollum", "Saruman", "The Witch-king of Angmar"},
            {"Christopher Nolan", "Quentin Tarantino", "Martin Scorsese", "James Cameron"}
    }, {
            {"Au", "Ag", "Fe", "Cu"},
            {"Isaac Newton", "Galileo Galilei", "Albert Einstein", "Niels Bohr"},
            {"Oxygen", "Silicon", "Aluminum", "Iron"},
            {"Photosynthesis", "Respiration", "Transpiration", "Fermentation"},
            {"Carbon Dioxide", "Oxygen", "Nitrogen", "Chlorine"},
            {"Alkali Metals", "Transition Metals", "Noble Gases", "Halogens"},
            {"299,792,458 meters per second", "150,000,000 meters per second", "100,000,000 meters per second", "200,000,000 meters per second"},
            {"Isaac Newton", "Niels Bohr", "Max Planck", "Albert Einstein"},
            {"Atom", "Molecule", "Cell", "Proton"},
            {"Mars", "Venus", "Jupiter", "Mercury"}
    }};

    public static String correctAnswers[] = {
            "Snapchat",
            "Elon Musk",
            "HTML",
            "Redmond",
            "Jupiter",
            "Japan",
            "Leonardo da Vinci",
            "Canberra",
            "Lion",
            "William Shakespeare",
            "Mount Everest",
            "Iron",
            "100°C",
            "Freddie Mercury",
            "Antarctica",
            "1945",
            "Carbon Dioxide",
            "Yen",
    };
    public static String CorrectAnswers[][] = {{
            "France",
            "2016",
            "Novak Djokovic",
            "New England Patriots",
            "Perfect",
            "Basketball",
            "Muhammad Ali",
            "Brazil",
            "Basketball",
            "Usain Bolt"
    }, {
            "Mars",
            "Ganymede",
            "Neil Armstrong",
            "Andromeda",
            "Olympus Mons",
            "Viking 1",
            "Gravitational Lensing",
            "Venus",
            "Sputnik 1",
            "Johannes Kepler"
    }, {
            "Frank Darabont",
            "Robert Downey Jr.",
            "1977",
            "Emma Stone",
            "The Lion King",
            "Parasite",
            "Leonardo DiCaprio",
            "The Silence of the Lambs",
            "Sauron",
            "Christopher Nolan"
    }, {
            "Au",
            "Albert Einstein",
            "Oxygen",
            "Photosynthesis",
            "Chlorine",
            "Noble Gases",
            "299,792,458 meters per second",
            "Albert Einstein",
            "Atom",
            "Mars"
    } };
}