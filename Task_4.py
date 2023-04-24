# 4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
# Пользователю должно показаться сообщение, что пустые строки вводить нельзя.


class Exception_empty_line(Exception):
    """Класс исключения для пустой строки"""
    def __str__(self) -> str:
        return "Ошибка: пустую строку вводить нельзя!!!"

    
def input_string():
    while True:
        try:
            str = input("Введите не пустую строку --> ")
            if len(str) == 0:
                raise Exception_empty_line
            else:
                return str
        except Exception_empty_line as e:
            print(e)


string = input_string()

print(f"Введена строка с текстом: {string}")