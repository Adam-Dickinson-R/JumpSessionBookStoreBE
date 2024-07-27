-- Create the User table
CREATE TABLE public.User (
                             id bigserial PRIMARY KEY,
                             name VARCHAR(50),
                             surname VARCHAR(50),
                             email VARCHAR(100),
                             phone_number VARCHAR(20)
);

-- Insert 2 users
INSERT INTO public.User (name, surname, email, phone_number) VALUES
                                                                 ('John', 'Doe', 'john.doe@example.com', '123-456-7890'),
                                                                 ('Jane', 'Smith', 'jane.smith@example.com', '098-765-4321');

-- Create the Admin table
CREATE TABLE public.Admin (
                              id bigserial PRIMARY KEY,
                              username VARCHAR(50),
                              password VARCHAR(255) -- Assuming hashed passwords
);

-- Insert 1 admin
INSERT INTO public.Admin (username, password) VALUES
    ('admin', 'password123'); -- You should hash the password before inserting it

-- Create the Books table
CREATE TABLE public.Books (
                              id bigserial PRIMARY KEY,
                              book_name VARCHAR(100),
                              isbn_number VARCHAR(20),
                              author VARCHAR(100)
);

-- Insert 20 books
INSERT INTO public.Books (book_name, isbn_number, author) VALUES
                                                              ('Book 1', '978-3-16-148410-0', 'Author A'),
                                                              ('Book 2', '978-1-234-56789-7', 'Author B'),
                                                              ('Book 3', '978-0-123-45678-9', 'Author C'),
                                                              ('Book 4', '978-1-234-56789-8', 'Author D'),
                                                              ('Book 5', '978-0-123-45678-0', 'Author E'),
                                                              ('Book 6', '978-3-16-148410-1', 'Author F'),
                                                              ('Book 7', '978-1-234-56789-6', 'Author G'),
                                                              ('Book 8', '978-0-123-45678-1', 'Author H'),
                                                              ('Book 9', '978-1-234-56789-5', 'Author I'),
                                                              ('Book 10', '978-0-123-45678-2', 'Author J'),
                                                              ('Book 11', '978-3-16-148410-2', 'Author K'),
                                                              ('Book 12', '978-1-234-56789-4', 'Author L'),
                                                              ('Book 13', '978-0-123-45678-3', 'Author M'),
                                                              ('Book 14', '978-1-234-56789-3', 'Author N'),
                                                              ('Book 15', '978-0-123-45678-4', 'Author O'),
                                                              ('Book 16', '978-3-16-148410-3', 'Author P'),
                                                              ('Book 17', '978-1-234-56789-2', 'Author Q'),
                                                              ('Book 18', '978-0-123-45678-5', 'Author R'),
                                                              ('Book 19', '978-1-234-56789-1', 'Author S'),
                                                              ('Book 20', '978-0-123-45678-6', 'Author T');

-- Create the UserBooks join table
CREATE TABLE public.UserBooks (
                                  user_id bigserial,
                                  book_id bigserial,
                                  stats VARCHAR(50),
                                  PRIMARY KEY (user_id, book_id),
                                  FOREIGN KEY (user_id) REFERENCES public.User(id),
                                  FOREIGN KEY (book_id) REFERENCES public.Books(id)
);
