import { Global, css } from '@emotion/react';
const baseStyle = css`
  * {
    margin: 0;
    padding: 0;
  }
  @font-face {
    font-family: 'Pretendard-Regular';
    src: url('@styles/fonts/Pretendard-Regular.ttf') format('truetype');
  }
  @font-face {
    font-family: 'TmonMonsori';
    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_two@1.0/TmonMonsori.woff') format('woff');
    font-weight: normal;
    font-style: normal;
  }
  html {
    height: 100%;
    font-family: 'Pretendard-Regular', sans-serif;
    font-size: 62.5%; //1rem = 10px;
    margin: 0;
    padding: 0;
  }
  body {
    height: 100%;
    font-size: 1.6rem;
    font-weight: 400;
    line-height: 1.2;
    background-color: white;
    color: black;
    margin: 0;
    padding: 0;
    box-sizing: border-box;
  }
  a {
    color: inherit;
    text-decoration: none;
  }
  li {
    list-style: none;
  }
  button {
    background: none;
    border: none;
    padding: 0;
    font: inherit;
    cursor: pointer;
    outline: inherit;
  }
`;

const GlobalStyle = () => <Global styles={baseStyle} />;

export default GlobalStyle;
