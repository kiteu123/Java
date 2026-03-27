import React, { useState } from "react";
import axios from "axios";
import "./App.css"; // CSS 파일 연결

function Weather() {
  const [city, setCity] = useState("");
  const [weather, setWeather] = useState(null);
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState("");

  const API_KEY = "a1beedffad4f0d07c8d9320d45156669";

  const getWeather = async (e) => {
    e.preventDefault();
    if (!city) return;

    setLoading(true);
    setError("");
    setWeather(null);

    try {
      const res = await axios.get(
        `https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${API_KEY}&units=metric&lang=kr`,
      );

      setWeather(res.data);
    } catch (err) {
      console.error(err);
      setError("도시를 찾을 수 없습니다 😢");
    } finally {
      setLoading(false);
    }
  };

  return (
    <div className="app">
      <div className="container">
        <h1 className="title">🌤 Weather App</h1>

        {/* 검색 */}
        <form className="search-form" onSubmit={getWeather}>
          <input
            className="search-input"
            type="text"
            placeholder="도시 입력 (예: Seoul)"
            value={city}
            onChange={(e) => setCity(e.target.value)}
          />
          <button className="search-button" disabled={loading}>
            검색
          </button>
        </form>

        {/* 에러 */}
        {error && <div className="error">{error}</div>}

        {/* 로딩 */}
        {loading && (
          <div className="loading">
            <div className="spinner"></div>
            <p>날씨 불러오는 중...</p>
          </div>
        )}

        {/* 날씨 카드 */}
        {weather && !loading && (
          <div className="weather-card">
            <div className="weather-header">
              <h2 className="city-name">{weather.name}</h2>

              <div className="weather-icon">
                <img
                  src={`https://openweathermap.org/img/wn/${weather.weather[0].icon}@2x.png`}
                  alt="weather"
                />
              </div>
            </div>

            <div className="temperature">{Math.round(weather.main.temp)}°C</div>

            <div className="weather-description">
              {weather.weather[0].description}
            </div>

            {/* 상세 정보 */}
            <div className="weather-details">
              <div className="detail-item">
                <span className="detail-label">체감온도</span>
                <span className="detail-value">
                  {Math.round(weather.main.feels_like)}°C
                </span>
              </div>

              <div className="detail-item">
                <span className="detail-label">습도</span>
                <span className="detail-value">{weather.main.humidity}%</span>
              </div>

              <div className="detail-item">
                <span className="detail-label">풍속</span>
                <span className="detail-value">{weather.wind.speed} m/s</span>
              </div>

              <div className="detail-item">
                <span className="detail-label">기압</span>
                <span className="detail-value">
                  {weather.main.pressure} hPa
                </span>
              </div>
            </div>
          </div>
        )}
      </div>
    </div>
  );
}

export default Weather;
