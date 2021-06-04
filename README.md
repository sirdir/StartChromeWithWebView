## StartChromeWithWebView

Idea to find out what specific arguments must be sent to chrome to expose `<webview>` when I use Selenium.  
So later than I can use same command line arguments for puppeteer/puppeteer-core

originally I was stuck with this [original-question] for Selenium 


### :(
Look like windowTypes is passed some other way, not through command line  

Supposedly puppeteer must work with `<webview>` here are [pptr-PR] and some [pptr-code]  
But at the same time there is issue [pptr-bug-for-electron-webview] that looks like my case, because I'm trying to get access to `electron <webview>`  

[original-question]: https://stackoverflow.com/questions/63225306/how-to-switch-to-iframe-inside-shadow-dom-with-selenium/63227482#63227482 
[pptr-PR]: https://github.com/puppeteer/puppeteer/pull/5905
[pptr-code]: https://github.com/puppeteer/puppeteer/blob/b75039746ac6bddf1411538242b5e70b0f2e6e8a/src/common/Target.ts
[pptr-bug-for-electron-webview]: https://github.com/puppeteer/puppeteer/issues/6473



