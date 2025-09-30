using BookStore;
using System;
using System.Collections;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BookStore
{
     public class Book
    {
        String Tittle { get; set; }
        String Author { get; set; }
        String Catagory { get; set; }
        double Price { get; set; }
        public Book(string tittle, string author, string catagory, double price)
        {
            Tittle = tittle;
            Author = author;
            Catagory = catagory;
            Price = price;
        }

        public void displayBooks()
        {
            Console.WriteLine("|||||||||||||||||||||||||||||");
            Console.WriteLine($"Title: {Tittle}");
            Console.WriteLine($"Author: {Author}");
            Console.WriteLine($"Catagory: {Catagory}");
            Console.WriteLine($"Catagory: {Price}");
            Console.WriteLine("|||||||||||||||||||||||||||||");
        }
    }
   }

public class BookSoreMenu
{
    
    public void addBooks()
    {
        ArrayList inventory = new ArrayList();

        Console.WriteLine("Enter a Book Title");
        string title = Console.ReadLine();
        Console.WriteLine("Enter a Book Author");
        string author = Console.ReadLine();
        Console.WriteLine("Select Catagory /n1.Fiction/n2.Non-fiction/n3.Children’s books");
        string cat = "";
        if (int.TryParse(Console.ReadLine(), out int category))
        {
            switch (category)
            {
                case 1:
                    cat = "Fiction";
                    break;
                case 2:
                    cat = "Non-fiction";
                    break;
                case 3:
                    cat = "Children's books";
                    break;
                default:
                    Console.ForegroundColor = ConsoleColor.Red;
                    Console.WriteLine("Invalid category number.");
                    Console.ResetColor();
                    break;
            }
        }
        else
        {
            {
                Console.WriteLine("Invalid input. Please enter a number.");
            }

            Console.WriteLine("Selected Category: " + cat);
        }


        Console.WriteLine("Enter the price");
        try
        {
            if (double.TryParse(Console.ReadLine(), out double price))
            {
                if (price <= 0)
                {
                    Console.ForegroundColor = ConsoleColor.Red;
                    Console.WriteLine("Enter a Valid Value");
                    Console.ResetColor();
                }
                else
                {
                    inventory.Add(new Book(title, author,cat, price));
                }
            }
        }
        catch (ArithmeticException e)
        {
            Console.ForegroundColor = ConsoleColor.Red;
            Console.WriteLine("Enter a Valid Value");
            Console.ResetColor();
        }
    }
    public void menu()
    {

        Console.WriteLine("Select Option");
        Console.WriteLine("1.Add Book");
        Console.WriteLine("2.Display All Books");
        Console.WriteLine("3.Search For Book Catagory");
        Console.WriteLine("4.Total Value Of Books");
        Console.WriteLine("5.Exit");

        int select = Convert.ToInt32(Console.ReadLine());

        switch (select)
        {
            
        }
        if (select <= 5 && select > 0)
        {
            do
            {
                menu();
            }

            while (select == 5);
        }
        else
        {
            Console.ForegroundColor = ConsoleColor.Red;
            Console.WriteLine("Enetr an Valid input");
            Console.ResetColor();
            menu();
        }

    }
}
    internal class Program
    {
        static void Main(string[] args)
        {
        BookSoreMenu menu =  new BookSoreMenu();
        menu.menu();

        }
    }
