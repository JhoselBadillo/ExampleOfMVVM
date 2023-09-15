
# Example Of MVVM

Aplicar la estructura a una aplicacion hecha con kotlin usando MVVM

# Data 📁
Se gestionan aqui los componentes relacionados a la capa de datos.
    - Network 📁
        - Clases Relacionadas a la comunicaicon de red.
            - QuoteApiClient 🗎
            -QuoteService 🗎
    - QuoteRepository 🗎
# Domain 📁
Aqui se definen los casos de uso que son las acciones que podra realizar la aplicacion.
    - GetQuotesUseCase 🗎
    - GetRandomQuoteUseCase 🗎
# Core 📁
Aqui se aloja las funcionalidades fundamentales de la aplicacion en este caso el "RetrofitHelper".
    - RetrofitHelper 🗎
# Model 📁
Contiene las clases de datos que representan las entidades a usar.
    - QuoteModel 🗎
    - QuoteProvider 🗎
# UI 📁
Interfaces de usuario
    - view📁
        - MainActivity 🗎
    - viewmodel 📁
        - QuoteViewModel 🗎
