# Spring-Boot-Internal-Working-With-Payment-System

A learning-focused Spring Boot project that demonstrates how the Spring Framework works under the hood.  This repository explores foundational concepts including Beans, Dependency Injection, IoC Container, Component Scanning, and AutoConfiguration.

## Purpose

This is **not a production application**. It's a pedagogical project designed to help developers understand Spring Boot's internal mechanisms through practical examples.

**Ideal for:**
- Students learning Spring Framework
- Developers exploring Bean lifecycle management
- Understanding how IoC container and DI actually work
- Experimenting with component scanning and autoconfiguration behavior

---

## Topics Covered

| Topic | Description |
|-------|-------------|
| **Project Setup** | Standard Spring Boot structure with Maven |
| **Beans** | What beans are and how Spring manages them in the container |
| **Constructor DI** | Injecting dependencies via constructors (recommended approach) |
| **@Autowired** | Automatic dependency injection by Spring |
| **Field vs Constructor DI** | Why constructor injection is preferred over field injection |
| **Benefits of DI** | Loose coupling, testability, separation of concerns |
| **@Primary & Conditionals** | Selecting default beans and environment-based configuration |
| **IoC Container** | How Spring controls object creation and lifecycle |
| **Component Scanning** | Auto-detection of `@Component`, `@Service`, `@Repository` |
| **AutoConfiguration** | Behind-the-scenes bean configuration based on classpath |
| **SpringApplication.run()** | What happens during application startup |

---

## Project Structure

```
src/main/java
└── your-packages/
    ├── controllers/       # REST endpoints (if any)
    ├── services/          # Business logic components
    ├── config/            # Configuration classes
    ├── beans/             # Bean definitions
    └── Application.java   # Main entry point
```

---

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/SandeshKhatiwada05/Spring-Boot-Internal-Working-With-Payment-System.git
cd Spring-Boot-Internal-Working-With-Payment-System
```

### Run the Application

```bash
mvn spring-boot:run
```

The application starts on **port 8080** by default. 

### Verify It's Running

```bash
curl http://localhost:8080
```

---

## Key Concepts Explained

### What Happens During `SpringApplication.run()`? 

1. **IoC Container Initialization** — ApplicationContext is created
2. **Component Scanning** — Spring scans packages for `@Component` and related annotations
3. **AutoConfiguration** — Spring Boot applies auto-config based on dependencies
4. **Bean Creation** — Beans are instantiated and dependencies are injected
5. **Application Ready** — Server starts and app is ready to handle requests

### Why Constructor Injection? 

- Immutable dependencies
- Easier to test (no reflection needed)
- Clear declaration of required dependencies
- Prevents `NullPointerException` scenarios

### @Primary vs @Conditional

- **@Primary**: Marks a bean as the default when multiple candidates exist
- **@ConditionalOnProperty**: Loads beans based on application properties or environment variables

---

## Requirements

- **Java 17+** (or version specified in `pom.xml`)
- **Maven 3.6+**
- **IDE** (IntelliJ IDEA, VS Code, Eclipse)

---

## Learning Path

1. Start with `Application. java` to see the entry point
2. Explore `config/` to understand bean definitions
3. Check `services/` for DI examples
4. Modify `application. properties` to test conditional beans
5. Add breakpoints in your IDE to trace bean creation

---

## Contributing

This is a learning project. Feel free to fork, experiment, and submit PRs with additional examples or improvements. 

---

## License

Educational use only. No formal license applied. 
