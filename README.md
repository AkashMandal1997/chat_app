# 💬 Real-Time Chat Application

A modern, real-time chat application built with **Spring Boot** and **WebSocket (STOMP)**. Features a beautiful, responsive UI with live message updates.

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.0-green)
![WebSocket](https://img.shields.io/badge/WebSocket-STOMP-blue)
![License](https://img.shields.io/badge/License-MIT-yellow)

## ✨ Features

- 🚀 **Real-time messaging** using WebSocket & STOMP protocol
- 🎨 **Modern UI** with gradient design and chat bubbles
- 🟢 **Online/Offline status indicators** with animated pulse
- 👤 **Dynamic user avatars** with initials
- ⏰ **Message timestamps**
- 📱 **Fully responsive** design
- ⌨️ **Enter key to send** messages
- 🔄 **Auto-reconnect** on connection drop

## 🛠️ Tech Stack

| Technology | Purpose |
|------------|---------|
| Java 21 | Programming Language |
| Spring Boot 4.0 | Backend Framework |
| WebSocket + STOMP | Real-time Communication |
| SockJS | WebSocket Fallback |
| Thymeleaf | Template Engine |
| Bootstrap 5 | CSS Framework |
| Font Awesome | Icons |

## 🚀 Quick Start

### Prerequisites
- Java 21+
- Maven 3.6+

### Run Locally

```bash
# Clone the repository
git clone https://github.com/AkashMandal1997/chat_app.git
cd chat_app

# Build and run
mvn spring-boot:run
```

Visit: **http://localhost:8080/chat**

### Build JAR

```bash
mvn clean package -DskipTests
java -jar target/chat-app-0.0.1-SNAPSHOT.jar
```

## 🐳 Docker

### Build & Run with Docker

```bash
# Build image
docker build -t chat-app .

# Run container
docker run -p 8080:8080 chat-app
```

## ☁️ Deploy to Render

1. Push code to GitHub
2. Create a new **Web Service** on [Render](https://render.com)
3. Connect your GitHub repository
4. Configure:
   - **Environment**: Docker
   - **Port**: 8080
5. Deploy!

## 📁 Project Structure

```
chat-app/
├── src/main/java/com/akash/chatapp/
│   ├── ChatAppApplication.java      # Main application
│   ├── config/
│   │   └── WebSocketConfig.java     # WebSocket configuration
│   ├── controller/
│   │   └── ChatController.java      # Chat endpoints
│   └── model/
│       └── Message.java             # Message entity
├── src/main/resources/
│   ├── templates/
│   │   └── chat.html                # Chat UI
│   └── application.properties       # App configuration
├── Dockerfile                        # Docker configuration
├── pom.xml                          # Maven dependencies
└── README.md
```

## 🔌 API Endpoints

| Endpoint | Type | Description |
|----------|------|-------------|
| `/chat` | GET | Chat page |
| `/chat` | WebSocket | STOMP endpoint |
| `/app/sendMessage` | STOMP | Send message |
| `/topic/message` | STOMP | Subscribe to messages |

## 🗺️ Roadmap - Future Improvements

### 🔐 Authentication & Security
- [ ] User registration & login (JWT)
- [ ] OAuth2 (Google, GitHub login)
- [ ] Password encryption
- [ ] Rate limiting

### 🏠 Chat Rooms
- [ ] Create/join chat rooms
- [ ] Private messaging (1-to-1)
- [ ] Room-based permissions
- [ ] Room admin controls

### 💾 Data Persistence
- [ ] PostgreSQL/MongoDB integration
- [ ] Message history
- [ ] User profiles
- [ ] Search messages

### 🎨 UI/UX Enhancements
- [ ] Dark mode toggle
- [ ] Emoji picker
- [ ] Typing indicators ("User is typing...")
- [ ] Read receipts (✓✓)
- [ ] Message reactions

### 📎 Media & Files
- [ ] Image sharing
- [ ] File uploads
- [ ] Voice messages
- [ ] GIF support

### 🔔 Notifications
- [ ] Push notifications
- [ ] Email notifications
- [ ] Sound alerts
- [ ] Unread message count

### 📊 Admin Features
- [ ] Admin dashboard
- [ ] User management
- [ ] Message moderation
- [ ] Analytics

## 🤝 Contributing

Contributions are welcome! Here's how you can help:

1. **Fork** the repository
2. **Create** a feature branch (`git checkout -b feature/amazing-feature`)
3. **Commit** your changes (`git commit -m 'Add amazing feature'`)
4. **Push** to the branch (`git push origin feature/amazing-feature`)
5. **Open** a Pull Request

### Good First Issues
- Add dark mode
- Implement emoji picker
- Add typing indicator
- Improve mobile responsiveness

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Author

**Akash Mandal**
- GitHub: [@AkashMandal1997](https://github.com/AkashMandal1997)
- LinkedIn: [Akash Mandal](https://www.linkedin.com/in/akashman)

---

⭐ **Star this repo** if you found it helpful!

💬 **Share your feedback** - Open an issue or reach out!

