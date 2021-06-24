package week7.day1.controller;

import week7.day1.controller.model.MovieRequest;
import week7.day1.exception.EmptyListException;
import week7.day1.exception.IllegalInputException;
import week7.day1.service.Service;

import java.util.Scanner;

public class MovieController {
    public static void create() throws IllegalInputException {
        Scanner scanner = new Scanner(System.in);
        MovieRequest movieRequest = new MovieRequest();
        System.out.println("name -- ");
        String info = scanner.nextLine();
        movieRequest.setTitle(info);
        System.out.println("year  -- ");
        movieRequest.setYear(scanner.next());
        System.out.println("genre -- ");
        info = scanner.next();
        movieRequest.setGenre(info);
        System.out.println("length -- ");
        movieRequest.setLength(scanner.next());
        Service.createMovie(movieRequest);
    }

    public static void Start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Create\n2.Read by Id\n3.Read all\n4.Remove by ID\n5.Update\n6.Finish");
        int key = scanner.nextInt();
        while (key != 6) {
            switch (key) {
                case 1: {
                    try {
                        create();
                        System.out.println("Movie is crated");
                    } catch (IllegalInputException e) {
                        System.out.println("Illegal Input , Movie is not created");
                    }
                    break;
                }
                case 2: {
                    try {
                        readById();
                    } catch (EmptyListException e) {
                        System.out.println("List is empty, Can't read movie");
                    } catch (IllegalInputException e) {
                        System.out.println("Illegal Input , Can't read movie");
                    }
                    break;
                }
                case 3: {
                    try {
                        readAll();
                    } catch (EmptyListException e) {
                        System.out.println("List is empty, Can't read Movies");
                    }
                    break;
                }
                case 4: {
                    try {
                        removeById();
                        System.out.println("Removed is done");
                    } catch (EmptyListException e) {
                        System.out.println("List is empty, Can't remove movie");
                    } catch (IllegalInputException e) {
                        System.out.println("Illegal input, Can't remove movie");
                    }
                    break;
                }
                case 5: {
                    try {
                        update();
                        System.out.println("Movie is updated");
                    } catch (EmptyListException e) {
                        System.out.println("List is empty, Can't update");
                    } catch (IllegalInputException e) {
                        System.out.println("Illegal Input,Can't update");
                    }
                    break;
                }
                default: {
                    System.out.println("enter the correct number");
                }
            }
            key = scanner.nextInt();
        }

    }

    public static void readAll() throws EmptyListException {
        Service.readAll();
    }

    public static void removeById() throws EmptyListException, IllegalInputException {
        Service.checkList();
        System.out.println("Enter the ID to remove movie");
        Scanner scanner = new Scanner(System.in);
        int ID = scanner.nextInt();
        Service.removeById(ID);
    }

    public static void readById() throws EmptyListException, IllegalInputException {
        Service.checkList();
        System.out.println("Enter the ID to read movie");
        Scanner scanner = new Scanner(System.in);
        int ID = scanner.nextInt();
        Service.readById(ID);
    }

    public static void update() throws EmptyListException, IllegalInputException {
        Scanner scanner = new Scanner(System.in);
        Service.checkList();
        System.out.println("Enter the ID of the film to update");
        int Id = scanner.nextInt();
        Service.checkId(Id);
        MovieRequest movieRequest = new MovieRequest();
        System.out.println("What do you want to update( enter the number)\n If you finished enter 0");
        System.out.println("1.name ");
        System.out.println("2.year  ");
        System.out.println("3.genre ");
        System.out.println("4.length ");
        int choose = scanner.nextInt();
        while (choose != 0) {
            switch (choose) {
                case 1: {
                    Scanner scanner1 = new Scanner(System.in);
                    String name = scanner1.nextLine();
                    movieRequest.setTitle(name);
                    break;
                }
                case 2: {
                    String year = scanner.next();
                    movieRequest.setYear(year);
                    break;
                }
                case 3: {
                    String genre = scanner.next();
                    movieRequest.setGenre(genre);
                    break;
                }
                case 4: {
                    String length = scanner.next();
                    movieRequest.setLength(length);
                    break;
                }
                default: {
                    System.out.println("enter the correct number");
                }
            }
            choose = scanner.nextInt();
        }
        Service.updateMovie(movieRequest, Id);
    }
}
